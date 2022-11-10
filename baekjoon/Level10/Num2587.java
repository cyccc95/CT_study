import java.util.Arrays;
import java.util.Scanner;

public class Num2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int mid = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        Arrays.sort(arr);
        mid = arr[2];
        System.out.println(sum / 5);
        System.out.println(mid);
    }
}

// 5개의 수의 평균과 중앙값을 구하는 문제