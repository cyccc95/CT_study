import java.util.Scanner;

public class Num3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] rest = new int[42];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            rest[arr[i]%42] = 1;
        }
        for (int i = 0; i < rest.length; i++){
            if(rest[i] == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}

// 서로 다른 나머지 찾는 문제