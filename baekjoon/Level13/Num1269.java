import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Num1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < a; i++){
            hs1.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < b; i++){
            hs2.add(Integer.parseInt(st.nextToken()));
        }

        int cnt1 = 0, cnt2 = 0;
        Iterator iter1 = hs1.iterator();
        Iterator iter2 = hs2.iterator();
        while (iter1.hasNext()){
            if (hs2.contains(iter1.next())){
                cnt2++;
            }
        }
        while (iter2.hasNext()){
            if (hs1.contains(iter2.next())){
                cnt1++;
            }
        }
        bw.write(Integer.toString(hs1.size() - cnt1 + hs2.size() - cnt2));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 둘 중 한 집합에만 속하는 원소를 모두 구하는 문제
