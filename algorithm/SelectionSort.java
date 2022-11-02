public class SelectionSort {
    public static void main(String[] args) {
        int i, j, min, temp;
        int index = 0;
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for(i = 0; i < 10; i++){
            min = 9999;
            for(j = i; j < 10; j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// 선택 정렬
// 가장 작은 것을 선택해서 제일 앞으로 보내는 알고리즘
// 선택 정렬의 시간 복잡도는 O(N^2)
