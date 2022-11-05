import java.util.Scanner;

public class Num2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 설탕 N kg
        int i;  // 3kg
        int j;  // 5kg
        int count = -1;          // 봉지 개수
        for(i = 0; i <= N / 3; i++){
            for(j = 0; j <= N / 5; j++){
                if (i * 3 + j * 5 == N) {
                    count = i + j;
                    break;
                }
            }
            if(count != -1) break;
        }
        System.out.println(count);
    }
}

// 5와 3을 최소 횟수로 합하여 N을 만드는 문제
