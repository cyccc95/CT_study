import java.util.Arrays;
import java.util.Scanner;

public class Num2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int[] sortArr = new int[9];

        for (int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            sortArr[i] = arr[i];
        }
        Arrays.sort(sortArr);

        for (int i = 0; i < 9; i++){
            if (arr[i] == sortArr[8]){
                System.out.println(sortArr[8]);
                System.out.println(i+1);
            }
        }
    }
}

// 최댓값이 어디에 있는지 찾는 문제