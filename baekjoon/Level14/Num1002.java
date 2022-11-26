import java.io.*;
import java.util.StringTokenizer;

public class Num1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] ans = new int[t];

        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            // 두 원의 중심 사이의 거리를 제곱한 값
            double x = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);

            // 두 원이 같은 경우
            if (x == 0 && r1 == r2){
                ans[i] = -1;
            }
            // 두 원의 반지름 합보다 중심 사이의 거리가 더 큰 경우
            else if (x > Math.pow(r1 + r2, 2)){
                ans[i] = 0;
            }
            // 한 원이 다른 원에 포함되지만 내접하지 않는 경우
            else if (x < Math.pow(r1 - r2, 2)) {
                ans[i] = 0;
            }
            // 내접하는 경우
            else if (x == Math.pow(r1 - r2, 2)) {
                ans[i] = 1;
            }
            // 외접하는 경우
            else if (x == Math.pow(r1 + r2, 2)){
                ans[i] = 1;
            }
            // 나머지 경우
            else {
                ans[i] = 2;
            }
        }

        for (int x : ans){
            bw.write(x + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 두 원의 교점의 개수를 구하는 문제
