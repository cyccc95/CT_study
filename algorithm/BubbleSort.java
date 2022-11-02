public class BubbleSort {
    public static void main(String[] args) {
        int i, j, temp;
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for(i = 0; i < 10; i++){
            for(j = 0; j < 9 - i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// 버블 정렬
// 옆에 있는 값과 비교하여 더 작은 값을 반복적으로 앞으로 보내는 정렬 알고리즘
// 정렬 알고리즘 중에서 구현은 가장 쉽지만 가장 비효율적
// 버블 정렬의 시간 복잡도는 O(N^2)
