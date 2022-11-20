import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Num14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> hs = new HashSet<>();

        for (int i = 0; i < n; i++){
            hs.add(br.readLine());
        }
        int cnt = 0;
        for (int i = 0; i < m; i++){
            if (hs.contains(br.readLine())){
                cnt++;
            }
        }
        bw.write(Integer.toString(cnt));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 수 대신 문자열을 저장하는 문제