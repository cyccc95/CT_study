import java.util.Scanner;

public class Num8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // test case
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();

        }
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0; // 연속된 O 체크
            int sum = 0; // 점수
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}

// OX 퀴즈의 결과를 일차원 배열로 입력받아 점수를 계산하는 문제