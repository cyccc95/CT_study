import java.util.Arrays;
import java.util.Scanner;

public class Num1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            sum += arr[i]/arr[arr.length-1]*100;
        }
        System.out.printf("%.2f",sum/n);
    }
}

// 평균을 조작하는 문제