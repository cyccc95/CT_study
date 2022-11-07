import java.util.Scanner;

public class Num2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = 0;
        for(int i = m; i <= n; i++){
            if(isPrime(i)) {
                min = i;
                break;
            }
        }
        for (int i = m; i <= n; i++){
            if(isPrime(i)) sum += i;
        }
        if (sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
    static boolean isPrime(int num){
        if(num == 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(int i = 3; i < num; i += 2){
            if(num % i == 0) return false;
        }
        return true;
    }
}

// 2부터 X-1까지 모두 나눠서 X가 소수인지 판별하는 문제2
