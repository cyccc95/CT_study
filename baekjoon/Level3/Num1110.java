import java.util.Scanner;

public class Num1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int newN = N;
        int count = 0;

        while(true) {
            newN = newN%10*10 + (newN/10+newN%10)%10;
            count++;
            if (N == newN) break;
        }
        System.out.println(count);

    }
}

// 원래 수로 돌아올 때까지 연산을 반복하는 문제


