import java.io.*;

public class Num10870 {
    static int fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(fib(n)));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 피보나치 수 역시 단순 for문으로도 구할 수 있지만,
// 학습을 위해 재귀를 써 봅시다.
