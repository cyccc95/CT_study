import java.io.*;

public class Num2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int min = 1000000;
        boolean flag = false;

        int answer = 1;
        while(answer < n){
            int i = answer;
            int sum = i;
            while(i != 0){
                sum += i % 10;
                i = i / 10;
            }
            if (sum == n && answer < min){
                min = answer;
                flag = true;
            }
            answer++;
        }

        if (flag){
            bw.write(Integer.toString(min));
        } else {
            bw.write(Integer.toString(0));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 모든 경우를 시도하여 N의 생성자를 구하는 문제
