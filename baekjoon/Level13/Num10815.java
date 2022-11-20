import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            hm.put(Integer.parseInt(st.nextToken()), 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] ans = new int[m];

        for (int i = 0; i < m; i++){
            ans[i] = hm.getOrDefault(Integer.parseInt(st.nextToken()), 0);
        }

        for (Integer num : ans){
            bw.write(num + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 카드의 집합을 만들어 특정 카드가 집합에 있는지 빠르게 찾는 문제