import java.io.*;
import java.util.*;

public class Num1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> hs = new HashSet<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            hs.add(br.readLine());
        }
        for (int i = 0; i < m; i++){
            String str = br.readLine();
            if (hs.contains(str)){
                list.add(str);
            }
        }
        Collections.sort(list);
        bw.write(list.size() + "\n");
        for (String x : list){
            bw.write(x + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 듣도 보도 못한 문제