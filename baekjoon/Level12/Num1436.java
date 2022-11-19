import java.io.*;

public class Num1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[10001];
        for (int i = 1, x = 666; i <= 10000; x++){
            if (Integer.toString(x).contains("666")){
                arr[i] = Integer.toString(x); i++;
            }
        }
        bw.write(arr[n]);

        br.close();
        bw.flush();
        bw.close();
    }
}

// N번째 종말의 수가 나올 때까지 차례대로 시도하는 문제