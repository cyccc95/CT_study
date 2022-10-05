import java.util.Scanner;

public class Num4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(); // test case
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt(); // case마다 학생 수
            int[] score = new int[n];
            double sum = 0; // case마다 점수 총합
            int cnt = 0; // 평균이 넘는 학생 수
            for (int j = 0; j < score.length; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            for (int j = 0; j < score.length; j++) {
                if(score[j] > sum/n) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", ((double)cnt/n)*100);

        }
    }
}
