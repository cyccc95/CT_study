import java.util.Scanner;

public class Num5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        for (int i = 0; i < 28; i++){
            int x = sc.nextInt();
            arr[x - 1] = 1;
        }
        for (int i = 0; i < 30; i++){
            if(arr[i] != 1){
                System.out.println(i + 1);
            }
        }
    }
}

// 과제 제출 기한이 지났습니다