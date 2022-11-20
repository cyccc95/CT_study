import java.io.*;
import java.util.StringTokenizer;

public class Num1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = Math.min(x, w - x);
        min = Math.min(min, y);
        min = Math.min(min, h - y);

        bw.write(Integer.toString(min));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 직사각형과 점의 거리를 구하는 문제