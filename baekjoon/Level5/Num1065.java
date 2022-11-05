import java.util.Scanner;

public class Num1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if(n >= 1 && n <= 99) {
            count = n;
        } else {
            count = 99;
            for(int i = 100; i <= n; i++) {
                int a = i/100;
                int b = i%100/10;
                int c = i%10;
                if(2*b == a+c){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

// 한수를 판별하는 함수를 정의