public class MergeSort {
    // 정렬 배열은 반드시 전역 변수로 선언
    static int[] sorted = new int[8];
    static void merge(int[] arr, int m, int middle, int n){
        int i = m;
        int j = middle + 1;
        int k = m;
        // 작은 순서대로 배열에 삽입
        while (i <= middle && j <= n) {
            if(arr[i] <= arr[j]){
                sorted[k] = arr[i];
                i++;
            } else {
                sorted[k] = arr[j];
                j++;
            }
            k++;
        }
        // 남은 데이터도 삽입
        if(i > middle){
            for(int t = j; t <= n; t++){
                sorted[k] = arr[t];
                k++;
            }
        } else {
            for(int t = i; t <= middle; t++){
                sorted[k] = arr[t];
                k++;
            }
        }
        // 정렬된 배열을 삽입
        for(int t = m; t <= n; t++){
            arr[t] = sorted[t];
        }
    }
    static void mergeSort(int[] arr, int m, int n){
        // 이외의 경우는 크기가 1개인 경우
        if(m < n){
            int middle = (m + n) / 2;
            mergeSort(arr, m, middle);
            mergeSort(arr, middle + 1, n);
            merge(arr, m, middle, n);
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,6,5,8,3,5,9,1};
        int num = arr.length;
        mergeSort(arr, 0, num - 1);
        for(int i = 0; i < num; i++){
            System.out.print(arr[i] + " ");
        }

    }
}

// 병합 정렬
// 하나의 큰 문제를 두 개의 작은 문제로 분할한 뒤에 각자 계산하고 나중에 합치는 방법
// 시간 복잡도 O(N * logN) 보장
// 기존의 데이터를 담을 추가적인 배열 공간이 필요하다는 점에서
// 메모리 활용이 비효율적이라는 문제가 있다
// 힙 정렬은 메모리 비효율성을 해결해준다
