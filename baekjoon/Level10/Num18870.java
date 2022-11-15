import java.io.*;
import java.util.*;

public class Num18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        for (int i = 0; i < n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        list2.addAll(list);
        Collections.sort(list2);

        int count = 0;
        for (int i = 0; i < list2.size(); i++){
            if (!hm.containsKey(list2.get(i))) hm.put(list2.get(i), count++);
        }

        for (int i : list){
            bw.write(hm.get(i) + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}

// 만약 정확한 값이 필요 없고 대소 관계만 필요하다면, 모든 수를 0이상 N미만의 수로 바꿀 수 있습니다.
