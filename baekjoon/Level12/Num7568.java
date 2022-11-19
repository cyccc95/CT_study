import java.io.*;
import java.util.StringTokenizer;

public class Num7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int[] count = new int[n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    count[i]++;
                }
            }
        }

        for (int cnt : count){
            bw.write(Integer.toString(cnt + 1) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 모든 사람을 비교하여 덩치 등수를 구하는 문제