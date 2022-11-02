public class InsertionSort {
    public static void main(String[] args) {
        int i, j, temp;
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
//        for(i = 0; i < 9; i++){
//            j = i;
//            while(j >= 0 && arr[j] > arr[j + 1]){
//                temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//                j--;
//            }
//        }
        for(i = 0; i < 10; i++){
            j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
            for(j = 0; j <= i; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

    }
}

// 삽입 정렬
// 각 숫자를 적절한 위치에 삽입하는 방법으로 해결
// 데이터가 거의 정렬된 상태에 한해서는 어떤 알고리즘보다도 빠르다는 특징
// 삽입 정렬의 시간 복잡도는 O(N^2)