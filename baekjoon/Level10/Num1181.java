import java.io.*;
import java.util.*;

public class Num1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            hs.add(st.nextToken());
        }
        List<String> list = new ArrayList<>(hs);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length();
            }
        });
        for (String str : list) {
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}

// 단어의 순서를 정의하여 정렬하는 문제