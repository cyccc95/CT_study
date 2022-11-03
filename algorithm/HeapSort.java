public class HeapSort {
    public static void main(String[] args) {
        int num = 9;
        int[] heap = {7,6,5,8,3,5,9,1,6};
        // 먼저 전체 트리 구조를 최대 힙 구조로 바꿈
        for (int i = 1; i < num; i++){
            int c = i;
            do {
                int root = (c - 1) / 2;
                if(heap[root] < heap[c]){
                    int temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                c = root;
            } while(c != 0);
        }
        // 크기를 줄여가면서 반복적으로 힙을 구성
        for(int i = num - 1; i >= 0; i--){
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            int root = 0;
            int c = 1;
            do {
                c = 2 * root + 1;
                // 자식 중에 더 큰 값을 찾기
                if(c < i - 1 && heap[c] < heap[c + 1]){
                    c++;
                }
                // 루트보다 자식이 더 크다면
                if(c < i && heap[root] < heap[c]){
                    temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                root = c;
            } while(c < i);
        }
        for(int i = 0; i < num; i++){
            System.out.print(heap[i] + " ");
        }
    }
}

// 힙 정렬
// 힙 트리 구조를 이용하는 정렬 방법
// 힙 생성 알고리즘(Heapify Algorithm)의 시간 복잡도 O(logN)
// 힙 정렬의 전체 시간 복잡도 O(N * logN)
// 메모리 측면에서 몹시 효율적이고 항상 O(N * logN)을 보장할 수
// 있다는 점에서 몹시 강력한 정렬 알고리즘
// 하지만 단순히 속도만 가지고 비교하면 퀵 정렬이 평균적으로
// 더 빠르기 때문에 힙 정렬이 일반적으로 많이 사용되지는 않는다

