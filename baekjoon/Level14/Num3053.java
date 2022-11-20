import java.util.Scanner;

public class Num3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(Math.PI * r * r);
        System.out.println(2 * r * r);

        sc.close();
    }
}

// 유클리드 기하학과 택시 기하학에 대한 문제