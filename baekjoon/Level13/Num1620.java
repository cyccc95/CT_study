import java.io.*;
import java.util.*;

public class Num1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> hm = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n + 1];
        for (int i = 1; i <= n; i++){
            String str = br.readLine();
            hm.put(str, i);
            arr[i] = str;
        }

        for (int i = 0; i < m; i++){
            String str = br.readLine();
            if (str.charAt(0) >= 49 && str.charAt(0) <= 57){
                bw.write( arr[Integer.parseInt(str)] + "\n");
            } else {
                bw.write(hm.get(str) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 맵을 사용하여 이름과 수를 연결짓는 문제