import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Num9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] ans = new int[t];

        for (int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> hm = new HashMap<>();
            for (int j = 0; j < n; j++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String value = st.nextToken();
                String key = st.nextToken();
                hm.put(key, hm.getOrDefault(key, 0) + 1);
            }

            int temp = 1;
            for (Integer x : hm.values()){
                temp *= x + 1;
            }

            ans[i] = temp - 1;
        }

        for (int x : ans){
            bw.write(x + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 경우의 수 연습문제
