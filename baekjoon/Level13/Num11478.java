import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Num11478 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> hs = new HashSet<>();

        String str = br.readLine();
        for (int i = 1; i <= str.length(); i++){
            for (int j = 0; j <= str.length() - i; j++){
                hs.add(str.substring(j, j + i));
            }
        }
        bw.write(Integer.toString(hs.size()));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 집합을 활용하여 중복을 제거하는 문제