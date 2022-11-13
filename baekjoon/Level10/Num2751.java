import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Num2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for (int v : list){
            sb.append(v).append("\n");
        }
        System.out.println(sb);
    }
}

// 시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 수 있습니다.
// 예를 들면 병합 정렬, 힙 정렬 등이 있지만,
// 어려운 알고리즘이므로 지금은 언어에 내장된 정렬 함수를 쓰는 것을 추천드립니다.