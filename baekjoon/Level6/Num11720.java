import java.util.Scanner;

public class Num11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] ch = str.toCharArray();
        int sum = 0;
        for(int i = 0; i < ch.length; i++) {
            sum += (ch[i]-'0');
        }
        System.out.println(sum);
    }
}

// 정수를 문자열로 입력받는 문제