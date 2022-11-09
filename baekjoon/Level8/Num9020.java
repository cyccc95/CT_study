import java.util.Scanner;

public class Num9020 {
    static int number = 20000;
    static int[] arr = new int[number + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        primeNumber();
        for (int i = 0; i < t; i++){
            int num = sc.nextInt();
            int a = num / 2;
            int b = num / 2;
            while(true){
                if (arr[a] == 1 && arr[b] == 1){
                    break;
                }
                a--; b++;
                if (a == 1) break;
            }
            if (a == 1){
                System.out.println(-1);
            } else {
                System.out.println(a + " " + b);
            }
        }
    }
    static void primeNumber(){
        for (int i = 2; i <= number; i++){
            arr[i] = 1;
        }
        for (int i = 2; i <= number; i++){
            if (arr[i] == 0) continue;
            for (int j = i * 2; j <= number; j += i){
                arr[j] = 0;
            }
        }
    }
}

// 소수 응용 문제2 골드바흐의 추측
