import java.util.Scanner;

public class Num11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;
        for (int i = 0; i < t; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Case #" + (i+1) + ": " + (a+b));
        }
    }
}

// A+B를 조금 더 아름답게 출력하는 문제
