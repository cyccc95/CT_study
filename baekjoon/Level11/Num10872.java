import java.io.*;

public class Num10872 {
    static int factorial(int n){
        if (n == 0 || n == 1) return 1;
        else return n * factorial(n - 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(factorial(n)));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 팩토리얼은 단순 for문으로도 구할 수 있지만, 학습을 위해 재귀를 써봅시다.