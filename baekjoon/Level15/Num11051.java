import java.io.*;
import java.util.StringTokenizer;

public class Num11051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[1001][1001];

        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= i; j++){
                if (i == j || j == 0){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j]) % 10007;
                }
            }
        }
        bw.write(Integer.toString(arr[n][k]));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 더 넓은 범위의 이항 계수를 동적 계획법으로 구하는 문제
