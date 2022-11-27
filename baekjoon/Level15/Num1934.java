import java.io.*;
import java.util.StringTokenizer;

public class Num1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        for (int i = 0; i < t; i++){
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
            arr[i] = lcm;
        }
        for (int x : arr){
            bw.write(x + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 유클리드 알고리즘으로 더 빠르게 푸는 문제