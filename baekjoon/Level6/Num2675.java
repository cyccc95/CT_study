import java.util.Scanner;

public class Num2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // test case
        int[] n = new int[t];   // 반복 횟수
        String[] str = new String[t];   // 문자열 입력받을 배열
        for (int i = 0; i < t; i++){
            n[i] = sc.nextInt();
            str[i] = sc.next();
        }
        for (int i = 0; i < t; i++){
            for (int j = 0; j < str[i].length(); j++){
                for (int k = 0; k < n[i]; k++){
                    System.out.print(str[i].charAt(j));
                }
            }
                System.out.println();
        }
    }
}

// 각 문자를 반복하여 출력하는 문제
