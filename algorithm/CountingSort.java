public class CountingSort {
    public static void main(String[] args) {
        int temp;
        int[] count = new int[5];
        int[] arr = {
                1,3,2,4,3,2,5,3,1,2,
                3,4,4,3,5,1,2,3,5,2,
                3,1,4,3,5,1,2,1,1,1
        };

        for(int i = 0; i < 30; i++){
            count[arr[i] - 1]++;
        }
        for (int i = 0; i < 5; i++){
            if(count[i] != 0){
                for(int j = 0; j < count[i]; j++){
                    System.out.print((i + 1) + " ");
                }
            }
        }
    }
}

// 계수 정렬
// 단순히 크기를 기준으로 세는 범위 조건이 있는 경우에 한해서 굉장히 빠른 알고리즘
// 시간 복잡도 O(N)