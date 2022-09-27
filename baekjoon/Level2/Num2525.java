import java.util.Scanner;

public class Num2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        if(m+t < 60){
            System.out.printf("%d %d",h,m+t);
        } else {
            if (h + (m+t)/60 > 23){
                System.out.printf("%d %d",h+(m+t)/60-24,(m+t)-(m+t)/60*60);
            } else {
                System.out.printf("%d %d",h+(m+t)/60,(m+t)-(m+t)/60*60);
            }
        }
    }
}


// 범위가 더 넓은 시간 계산 문제