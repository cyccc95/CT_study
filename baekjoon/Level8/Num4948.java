import java.util.Scanner;

public class Num4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            if (n == 0) break;
            int count = 0;
            for (int i = n + 1; i <= n * 2; i++){
                if (isPrime(i)) count++;
            }
            System.out.println(count);
        }
    }
    static boolean isPrime(int num){
        if (num == 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= (int)Math.sqrt(num); i += 2){
            if (num % i == 0) return false;
        }
        return true;
    }
}

// 소수 응용 문제1 베르트랑 공준
