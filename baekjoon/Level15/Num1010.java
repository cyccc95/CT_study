import java.io.*;
import java.util.StringTokenizer;

public class Num1010 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] ans = new int[t];
        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int result = 1;
            for (int j = 0; j < n; j++){
                result = result * (m - j) / (j + 1);
            }
            ans[i] = result;
        }
        for (int x : ans){
            bw.write(x + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

// 다리를 놓는 경우의 수를 구하는 문제
