import java.util.Scanner;

public class Num1316 {
    static Scanner sc = new Scanner(System.in);
    static boolean check(){
        boolean[] checkArr = new boolean[26];
        String str = sc.next();
        char pre = str.charAt(0);
        checkArr[pre - 'a'] = true;
        for (int i = 1; i < str.length(); i++){
            char now = str.charAt(i);
            if (now != pre){
                if (!checkArr[now - 'a']){
                    checkArr[now - 'a'] = true;
                    pre = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++){
            if (check() == true){
                count++;
            }
        }
        System.out.println(count);
    }
}

// 조건에 맞는 문자열을 찾는 문제
