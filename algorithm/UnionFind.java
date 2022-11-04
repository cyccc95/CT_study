public class UnionFind {
    static int getParent(int[] parent, int x){
        if(parent[x] == x) return x;
        return parent[x] = getParent(parent,parent[x]);
    }
    // 각 부모의 노드를 합친다
    static void unionParent(int[] parent, int a, int b){
        a = getParent(parent, a);
        b = getParent(parent, b);
        if(a < b) parent[b] = a;
        else parent[a] = b;
    }
    // 같은 부모 노드를 가지는지 확인
    static int findParent(int[] parent, int a, int b){
        a = getParent(parent, a);
        b = getParent(parent, b);
        if(a == b) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        int[] parent = new int[11];
        for(int i = 1; i <= 10; i++){
            parent[i] = i;
        }
        unionParent(parent, 1, 2);
        unionParent(parent, 2, 3);
        unionParent(parent, 3, 4);
        unionParent(parent, 5, 6);
        unionParent(parent, 6, 7);
        unionParent(parent, 7, 8);
        System.out.printf("1과 5는 연결되어있나요? %d\n",findParent(parent, 1, 5));
        unionParent(parent, 1, 5);
        System.out.printf("1과 5는 연결되어있나요? %d\n",findParent(parent, 1, 5));

    }
}

// 합집합 찾기
// 서로소 집합(Disjoint-Set) 알고리즘이라고도 부른다
// 구체적으로 여러 개의 노드가 존재할 때 두 개의 노드를 선택해서
// 현재 이 두 노드가 서로 같은 그래프에 속하는지 판별하는 알고리즘
