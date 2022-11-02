public class QuickSort {
    static void quickSort(int[] arr, int start, int end){
        if(start >= end) {  // 원소가 1개인 경우
            return;
        }
        int key = start;
        int i = start + 1;
        int j = end;
        int temp;

        while(i <= j) { // 엇갈릴 때까지 반복
            while(i <= end && arr[i] <= arr[key]){ // 키 값보다 큰 값을 만날 때까지
                i++;
            }
            while(j > start && arr[j] >= arr[key]){ // 키 값보다 작은 값을 만날 때까지
                j--;
            }
            if(i > j){ // 현재 엇갈린 상태면 키 값과 교체
                temp = arr[j];
                arr[j] = arr[key];
                arr[key] = temp;
            } else {    // 엇갈리지 않았다면 i와 j를 교체
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        quickSort(arr, start, j - 1);
        quickSort(arr, j + 1, end);
    }
    public static void main(String[] args) {
        int num = 10;
        int[] arr = {3, 7, 8, 1, 5, 9, 6, 10, 2, 4};
        quickSort(arr, 0, num - 1);
        for (int i = 0; i < num; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// 퀵 정렬
// 특정한 값(pivot)을 기준으로 큰 숫자와 작은 숫자를 나누는 대표적인 분할 정복 알고리즘
// 시간 복잡도 평균 O(N * logN), 최악 O(N^2)
// 이미 정렬이 되어 있는 경우 퀵 정렬의 시간 복잡도는 O(N^2)에 가깝다.
// 반면 삽입 정렬의 경우는 매우 빠르므로 정렬할 데이터 특성에 따라서
// 적절한 정렬 알고리즘을 사용하는 것이 중요
