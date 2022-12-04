import java.io.*;
import java.util.StringTokenizer;

public class Num2004 {
    static long count5(long n){
        int count = 0;
        while(n >= 5){
            count += (n / 5);
            n /= 5;
        }
        return count;
    }

    static long count2(long m){
        int count = 0;
        while(m >= 2){
            count += (m / 2);
            m /= 2;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long cnt5 = count5(n) - count5(n - m) - count5(m);
        long cnt2 = count2(n) - count2(n - m) - count2(m);

        bw.write(Long.toString(Math.min(cnt5, cnt2)));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 이항계수에서 끝에 0이 얼마나 많이 오는지 구하는 문제
