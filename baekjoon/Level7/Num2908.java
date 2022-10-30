import java.util.Scanner;

public class Num2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int newA = a%10*100 + (a/10 - a/100*10)*10 + a/100;
        int newB = b%10*100 + (b/10 - b/100*10)*10 + b/100;

        if (newA > newB) {
            System.out.println(newA);
        } else {
            System.out.println(newB);
        }
    }
}

// 숫자를 뒤집어서 비교하는 문제
