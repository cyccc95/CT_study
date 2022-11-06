import java.util.Scanner;

public class Num1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = N;
        int num;
        for (int i = 0; i < N; i++){
            num = sc.nextInt();
            if (num == 1){
                count--;
            }
            if(num >= 4){
                if(num % 2 == 0){
                    count--;
                } else {
                    for (int j = 3; j < num; j += 2){
                        if(num % j == 0){
                            count--; break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}

// 2부터 X-1까지 모두 나눠서 X가 소수인지 판별하는 문제1
