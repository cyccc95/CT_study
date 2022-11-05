import java.util.Scanner;

public class Num2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스
        int[] k = new int[T];
        int[] n = new int[T];
        int[][] apt = new int[15][15];
        for (int i = 0; i < 15; i++){
            apt[i][1] = 1;
            apt[0][i] = i;
        }
        for (int i = 1; i < 15; i++){
            for (int j = 2; j < 15; j++){
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
            }
        }
        for (int i = 0; i < T; i++){
            k[i] = sc.nextInt();
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < T; i++){
            System.out.println(apt[k[i]][n[i]]);
        }

    }
}

// 층과 거주자 수의 규칙을 찾는 문제
