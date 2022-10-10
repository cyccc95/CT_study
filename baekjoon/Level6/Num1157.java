import java.util.Arrays;
import java.util.Scanner;

public class Num1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int[] arr = new int[26];

        for (char i = 'A'; i <='Z'; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == str.charAt(j)) {
                    arr[i-65]++;
                }
            }
        }
        int[] arr2 = Arrays.copyOf(arr,26);
        Arrays.sort(arr2);
        int max = arr2[25];
        if(arr2[25] == arr2[24]) {
            System.out.println("?");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {
                    System.out.println((char)(i+65));
                    break;
                }
            }
        }
    }
}

// 주어진 단어에서 가장 많이 사용된 알파벳을 출력하는 문제
