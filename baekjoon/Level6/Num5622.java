import java.util.Scanner;

public class Num5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = new String();
        str = sc.next().toUpperCase();

        int time = 0; // 65 A 90 Z
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'C'){
                time += 3;
            } else if (str.charAt(i) >= 'D' && str.charAt(i) <= 'F') {
                time += 4;
            } else if (str.charAt(i) >= 'G' && str.charAt(i) <= 'I') {
                time += 5;
            } else if (str.charAt(i) >= 'J' && str.charAt(i) <= 'L') {
                time += 6;
            } else if (str.charAt(i) >= 'M' && str.charAt(i) <= 'O') {
                time += 7;
            } else if (str.charAt(i) >= 'P' && str.charAt(i) <= 'S') {
                time += 8;
            } else if (str.charAt(i) >= 'T' && str.charAt(i) <= 'V') {
                time += 9;
            } else {
                time += 10;
            }
        }
        System.out.println(time);

    }
}

// 규칙에 따라 문자에 대응하는 수를 출력하는 문제
