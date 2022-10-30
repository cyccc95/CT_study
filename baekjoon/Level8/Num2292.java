import java.util.Scanner;

public class Num2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int num = 2;

        if(n == 1){
            System.out.println(1);
        } else {
            while (num <= n){
                num += 6 * count;
                count++;
            }
            System.out.println(count);
        }
    }
}

// 벌집이 형성되는 규칙에 따라 벌집의 위치를 구하는 문제