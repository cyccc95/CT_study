import java.util.Arrays;
import java.util.Scanner;

public class Num2750 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i =0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}

// 시간 복잡도가 O(n^2)인 정렬 알고리즘으로 풀 수 있습니다. 예를 들면 삽입 정렬, 거품 정렬 등이 있습니다.
