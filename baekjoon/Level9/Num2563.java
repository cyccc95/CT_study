import java.util.Scanner;

public class Num2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[100][100];
        int count = 0;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x; j < x + 10; j++){
                for(int k = y; k < y + 10; k++){
                    arr[j][k] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

// 2차원 배열을 활용하여 색종이로 평면을 덮는 문제