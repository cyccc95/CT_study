import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Num3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> hmX = new HashMap<>();
        Map<Integer, Integer> hmY = new HashMap<>();

        for (int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            hmX.put(Integer.parseInt(str1),
                    hmX.getOrDefault(Integer.parseInt(str1), 0) + 1);
            hmY.put(Integer.parseInt(str2),
                    hmY.getOrDefault(Integer.parseInt(str2), 0) + 1);
        }

        for (Integer key : hmX.keySet()){
            if (hmX.get(key) == 1){
                bw.write(key + " ");
            }
        }
        for (Integer key : hmY.keySet()){
            if (hmY.get(key) == 1){
                bw.write(key + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 직사각형을 완성하는 문제