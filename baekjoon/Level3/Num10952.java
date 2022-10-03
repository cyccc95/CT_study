import java.util.Scanner;

public class Num10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) break;
            System.out.println(a+b);
        }
    }
}

// 0 0이 들어올 때까지 A+B를 출력하는 문제