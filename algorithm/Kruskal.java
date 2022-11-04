import java.util.Arrays;
import java.util.Scanner;
/*
sample input(첫 줄의 첫 숫자는 정점의 개수, 두 번째 숫자는 간선의 개수).
6 9
1 6 5
2 4 6
1 2 7
3 5 15
5 6 9
3 4 10
1 3 11
2 3 3
4 5 7
 */
public class Kruskal {
    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a > b) parent[a] = b;
        else parent[b] = a;

    }
    static int find(int x) {
        if (parent[x] == x) return x;
        else return find(parent[x]);
    }
    static int V, E;
    static int[][] graph;
    // 각 노드의 부모
    static int[] parent;
    // 최종적으로 연결된 최소 신장 트리 연결 비용
    static int final_cost;

    public static void main(String[] args) {
        // 그래프의 연결상태(노드1, 노드2, 비용)을 초기화
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        graph = new int[E][3];
        for(int i = 0; i < E; i++){
            graph[i][0] = sc.nextInt();
            graph[i][1] = sc.nextInt();
            graph[i][2] = sc.nextInt();
        }
        parent = new int[V + 1];
        final_cost = 0;

        // 간선 비용 순으로 오름차순 정렬
        Arrays.sort(graph, (o1,o2) -> Integer.compare(o1[2], o2[2]));

        // makeSet
        for (int i = 1; i <= V; i++){
            parent[i] = i;
        }
        // 낮은 비용부터 크루스칼 알고리즘 진행
        for (int i = 0; i < E; i++){
            // 사이클이 존재하지 않는 경우에만 간선을 선택한다
            // 여기서는 최소 비용만 고려
            if(find(graph[i][0]) != find(graph[i][1])){
                System.out.println("<선택된 간선>");
                System.out.println(Arrays.toString(graph[i]));
                union(graph[i][0], graph[i][1]);
                final_cost += graph[i][2];
                System.out.println("<각 노드가 가리키고 있는 부모>");
                for (int j = 1; j <= V; j++){
                    System.out.print(parent[j] + " ");
                }
                System.out.println();
                continue;
            }
        }
        System.out.println("최종 비용 : " + final_cost);
        sc.close();
    }
}

// 크루스칼 알고리즘
// 가장 적은 비용으로 모든 노드를 연결하기 위해 사용하는 알고리즘
// 다시 말해 최소 비용 신장 트리를 만들기 위한 대표적인 알고리즘
// 흔히 여러 개의 도시가 있을 때 각 도시를 도로를 이용해 연결하고자 할 때
// 비용을 최소한으로 하고자 할 때 실제로 적용되는 알고리즘

// 모든 노드를 최대한 적은 비용으로 연결만 시키면 되기 때문에 모든 간선 정보를
// 오름차순으로 정렬한 뒤에 비용이 적은 간선부터 차근차근 그래프에 포함시킴

// 정렬된 순서에 맞게 그래프에 포함시킴
// 포함시키기 전에는 사이클 테이블을 확인
// 사이클을 형성하는 경우 간선을 포함하지 않는다

// 크루스칼 알고리즘은 사실상 정렬 알고리즘과 UnionFind 알고리즘의 합이라고
// 할 수 있으므로 정렬 알고리즘의 시간 복잡도와 동일하다고 판단해도 큰 무리가 없음
