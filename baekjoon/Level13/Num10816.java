import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Num10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            hm.put(Integer.parseInt(str),
                    hm.getOrDefault(Integer.parseInt(str), 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()){
            bw.write(hm.getOrDefault(Integer.parseInt(st.nextToken()), 0) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 각 카드의 개수를 찾는 문제