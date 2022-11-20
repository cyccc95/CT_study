import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int[] arr = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                break;
            }
            Arrays.sort(arr);
            if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]){
                bw.write("right\n");
            } else{
                bw.write("wrong\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 피타고라스의 정리에 대해 배우는 문제