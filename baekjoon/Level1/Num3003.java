import java.util.Scanner;

public class Num3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int q = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        int kn = sc.nextInt();
        int p = sc.nextInt();

        System.out.printf("%d %d %d %d %d %d",1-k,1-q,2-l,2-b,2-kn,8-p);
    }
}

// 킹, 퀸, 룩, 비숍, 나이트, 폰