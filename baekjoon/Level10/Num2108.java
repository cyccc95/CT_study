import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Num2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        double sum = 0;
        for (int i = 0; i < n; i++){
            int temp = Integer.parseInt(br.readLine());
            sum += temp;
            list.add(temp);
        }

        Collections.sort(list);

        int max = Collections.max(list);
        int min = Collections.min(list);

        int avg = (int)Math.round(sum / n);
        int mid = list.get(n / 2);
        int range = max - min;
        int mode = 0;

        for (int num : list){
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }

        int numbers = 0;
        for (int key : hs.values()){
            numbers = Math.max(numbers, key);
        }

        list.clear();
        for (int key : hs.keySet()){
            if (hs.get(key) == numbers){
                list.add(key);
            }
        }

        Collections.sort(list);

        if (list.size() >= 2){
            mode = list.get(1);
        } else {
            mode = list.get(0);
        }

        System.out.println(avg);
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(range);
    }
}

// 정렬을 활용하는 문제