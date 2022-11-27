import java.io.*;
import java.util.StringTokenizer;

public class Num5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x == 0 & y == 0) break;

            if (x % y == 0){
                bw.write("multiple\n");
            } else if (y % x == 0){
                bw.write("factor\n");
            } else {
                bw.write("neither\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 배수와 약수를 배우는 문제
