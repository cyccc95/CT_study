import java.util.Scanner;

public class Num2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < cro.length; i++){
            str = str.replace(cro[i], "x");
        }
        System.out.println(str.length());
    }
}

// 크로아티아 알파벳의 개수를 세는 문제
