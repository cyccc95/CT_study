import java.util.Scanner;

public class Num10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == v){
                count++;
            }
        }
        System.out.println(count);
    }
}

// 배열을 입력받고 v를 찾는 문제