import java.io.*;
import java.util.StringTokenizer;

public class Num1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 테스트 케이스
        int t = Integer.parseInt(br.readLine());
        int[] ans = new int[t];

        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int count = 0;
            int c = Integer.parseInt(br.readLine());
            for (int j = 0; j < c; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int cr = Integer.parseInt(st.nextToken());
                double start = Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2);
                double end = Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2);
                if (start < Math.pow(cr, 2) || end < Math.pow(cr, 2)) {
                    count++;
                }
                if (start < Math.pow(cr, 2) && end < Math.pow(cr, 2)) {
                    count--;
                }
            }
            ans[i] = count;
        }
        for (int x : ans){
            bw.write(x + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 도형이 배치된 모습을 잘 관찰하면서 아이디어를 얻는 문제
