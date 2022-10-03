import java.util.Scanner;

public class Num8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}

// 1부터 N까지의 합을 구하는 문제
