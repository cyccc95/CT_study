import java.io.*;

public class Num25501 {
    static int count;
    static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    static int isPalindrome(String s){
        count = 0;
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] ans = new int[n][2];

        for (int i = 0; i < n; i++){
            ans[i][0] = isPalindrome(br.readLine());
            ans[i][1] = count;
        }

        for (int[] a : ans){
            bw.write(a[0] + " " + a[1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();


    }


}

// 재귀의 동작을 파악하는 문제
