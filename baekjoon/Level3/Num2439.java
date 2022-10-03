import java.util.Scanner;

public class Num2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i-1;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 별을 찍는 문제 2
