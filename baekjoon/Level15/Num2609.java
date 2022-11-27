import java.io.*;
import java.util.StringTokenizer;

public class Num2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max, min;
        int gcd = 0, lcm = 0, rem;

        if(a > b) {
            max = a; min = b;
        } else {
            max = b; min = a;
        }

        while(max % min >= 0){
            rem = max % min;
            if (rem == 0){
                gcd = min;
                lcm = a * b / gcd;
                break;
            } else {
                max = min;
                min = rem;
            }
        }
        bw.write(gcd + "\n" + lcm);

        br.close();
        bw.flush();
        bw.close();
    }
}

// 최대공약수와 최소공배수를 구하는 문제
