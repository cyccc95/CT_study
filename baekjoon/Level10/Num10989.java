import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        for (int i = 1; i <= n; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 1; i <= 10000; i++){
            for (int j = 0; j < arr[i]; j++){
                if (arr[i] != 0){
                    sb.append(i).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}

// 수의 범위가 작다면 카운팅 정렬을 사용하여 더욱 빠르게 정렬할 수 있습니다.
