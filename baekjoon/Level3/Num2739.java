import java.util.Scanner;

public class Num2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
}

// 구구단을 출력하는 문제
