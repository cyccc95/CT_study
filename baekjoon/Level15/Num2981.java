import java.io.*;
import java.util.Arrays;

public class Num2981 {
    static int gcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int gcdVal = arr[1] - arr[0]; // 음수가 되지 않도록 큰 수에서 작은 수를 뺀다
        for (int i = 2; i < n; i++){
            // 직전의 최대 공약수와 다음 수의 최대공약수를 갱신
            gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
        }

        // 최대공약수의 약수 찾기
        for (int i = 2; i <= gcdVal; i++){
            // i가 최대공약수의 약수라면 출력
            if (gcdVal % i == 0){
                bw.write(i + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// N개의 수를 M으로 나누었을 때, 나머지가 전부 같은 M을 찾는 문제