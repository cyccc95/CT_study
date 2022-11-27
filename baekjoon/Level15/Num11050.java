import java.io.*;
import java.util.StringTokenizer;

public class Num11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = 1, b = 1;
        for (int i = n; i > n - k; i--){
            a *= i;
        }
        for (int i = k; i >=1; i--){
            b *= i;
        }
        bw.write(Integer.toString(a / b));

        br.close();
        bw.flush();
        bw.close();
    }
}

// N개의 물건 중 순서를 고려하지 않고 K개를 고르는 경우의 수, 이항 계수를 구하는 문제