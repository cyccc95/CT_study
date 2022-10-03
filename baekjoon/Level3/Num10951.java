import java.util.Scanner;

public class Num10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}

// 입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.