import java.util.Stack;

public class DFS {
    // 방문처리에 사용 할 배열 선언
    static boolean[] visited = new boolean[9];

    // 그래프를 2차원 배열로 선언
    static int[][] graph = {
            {},
            {2,3,8}, {1,6,8}, {1,5}, {5,7},
            {3,4,7}, {2}, {4,5}, {1,2}
    };

    // DFS 사용할 스택
    static Stack<Integer> st = new Stack<>();

    static void dfsRecursion(int nodeIndex){
        // 방문 처리
        visited[nodeIndex] = true;

        // 방문 노드 출력
        System.out.print(nodeIndex + " ");

        // 방문한 노드에 인접한 노드 찾기
        for (int node : graph[nodeIndex]){
            // 인접한 노드가 방문한 적이 없다면 DFS 수행
            if(!visited[node]){
                dfsRecursion(node);
            }
        }
    }

    public static void main(String[] args) {
        // 재귀 Recursion 형태로 구현
//        dfsRecursion(1);

        // Stack 자료구조 사용해서 구현
        // 시작 노드를 스택에 넣어주고 방문 처리, 출력
        st.push(1);
        visited[1] = true;
        System.out.print(1 + " ");

        // 스택이 비어있지 않으면 계속 반복
        while (!st.isEmpty()) {
            // 스택에서 하나를 꺼낸다
            int nodeIndex = st.peek();
            boolean flag = false;
            // 꺼낸 노드와 인접한 노드 찾기
            int len = graph[nodeIndex].length;
            for (int i = 0; i <= len - 1; i++) {
                if (!visited[graph[nodeIndex][i]]) {
                    st.push(graph[nodeIndex][i]);
                    System.out.print(graph[nodeIndex][i] + " ");
                    visited[graph[nodeIndex][i]] = true;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                st.pop();
            }

        }
    }
}

// 깊이 우선 탐색(Depth First Search)
// 맹목적으로 각 노드를 탐색할 때 주로 사용
// 컴퓨터는 구조적으로 항상 스택의 원리를 사용하기 때문에
// 스택을 사용하지 않아도 구현 가능하다는 특징

