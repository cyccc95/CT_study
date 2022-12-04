import java.io.*;
import java.util.StringTokenizer;

public class Num3036 {
    static String cal(int a, int b){
        while(true){
            int i;
            for (i = 2; i <= b; i++){
                if (a % i == 0 && b % i == 0){
                    a /= i;
                    b /= i;
                    break;
                }
            }
            if (i == b + 1){
                break;
            }
        }
        return a + "/" + b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        String[] ans = new String[n - 1];
        for (int i = 0; i < n - 1; i++){
            ans[i] = cal(arr[0], arr[i + 1]);
        }

        for (String str : ans){
            bw.write(str + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

// 첫번째 링을 한 바퀴 돌렸을 때, 나머지 링이 몇 바퀴 도는지 구하는 문제