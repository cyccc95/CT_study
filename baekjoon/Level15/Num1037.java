import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        if (num % 2 == 0){
            bw.write(Integer.toString(arr[0] * arr[arr.length - 1]));
        } else {
            bw.write(Integer.toString(arr[arr.length / 2] * arr[arr.length / 2]));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

// 약수의 성질을 활용하는 문제
