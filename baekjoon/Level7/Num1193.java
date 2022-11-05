import java.util.Scanner;

public class Num1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(true){
            i++;
            if(check(i) >= n) {
                break;
            }
        }
        int x = n - check(i - 1);
        if(i % 2 == 0){
            System.out.println(x + "/" + (i - x + 1));
        } else {
            System.out.println((i -x + 1) + "/" + x);
        }
    }
    static int check(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        return  sum;
    }
}

// 분수의 순서에서 규칙을 찾는 문제