import java.util.Scanner;

public class Num11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;
        for (int i = 0; i < t; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n",i+1,a,b,a+b);
        }
    }
}

// A+B를 바로 위 문제보다 아름답게 출력하는 문제