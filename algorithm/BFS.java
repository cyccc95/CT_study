import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        // 그래프를 2차원 배열로 표현
        // 배열의 인덱스를 노드와 매칭시키기 위해 인덱스 0은 사용x
        int[][] graph = {
                {},
                {2,3,8}, {1,6,8}, {1,5}, {5,7},
                {3,4,7}, {2}, {4,5}, {1,2}
        };

        // 방문처리를 위한 boolean배열 선언
        boolean[] visited = new boolean[9];

        System.out.println(bfs(1, graph, visited));
    }
    static String bfs(int start, int[][] graph, boolean[] visited){
        // 탐색 순서를 출력하기 위한 용도
        StringBuilder sb = new StringBuilder();
        // BFS에 사용할 큐를 생성
        Queue<Integer> q = new LinkedList<>();

        // 큐에 BFS를 시작할 노드 번호를 넣어준다
        q.offer(start);

        // 시작 노드 방문처리
        visited[start] = true;

        // 큐가 빌 때까지 반복
        while(!q.isEmpty()){
            int nodeIndex = q.poll();
            sb.append(nodeIndex + " ");
            // 큐에서 꺼낸 노드와 연결된 노드를 체크
            for(int i = 0; i < graph[nodeIndex].length; i++){
                int temp = graph[nodeIndex][i];
                // 방문하지 않았으면 방문처리 후 큐에 넣기
                if(!visited[temp]){
                    visited[temp] = true;
                    q.offer(temp);
                }
            }
        }
        return sb.toString();
    }
}

// 너비 우선 탐색(Breadth First Search)
// 맹목적인 탐색을 하고자 할 때 사용할 수 있는 탐색 기법
// 최단 경로를 찾아준다는 점에서 최단 길이를 보장해야 할 때 많이 사용