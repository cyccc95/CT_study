import java.util.Scanner;

public class Num10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        char[] ch = str.toCharArray();
//        int[] check = new int[26];
//        for(int i = 0; i < check.length; i++){
//            for (int j = 0; j < ch.length; j++){
//                if(ch[j] == (char)(i+97)){
//                    check[i] = j; break;
//                } else {
//                    check[i] = -1;
//                }
//            }
//            System.out.print(check[i] + " ");
//        }
        for (char i = 'a'; i < 'z'; i++){
            System.out.print(str.indexOf(i)+" ");
        }
    }
}

// 한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제