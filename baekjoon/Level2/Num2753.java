import java.util.Scanner;

public class Num2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("1");
        } else if (year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

// 윤년을 판별하는 문제
