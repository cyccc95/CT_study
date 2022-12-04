import java.io.*;

public class Num1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= n; i++){
            int j = i;
            while(j > 0){
                if (j % 5 == 0){
                    count++;
                    j /= 5;
                } else {
                    break;
                }
            }
        }

        bw.write(Integer.toString(count));
        br.close();
        bw.flush();
        bw.close();
    }
}

// 소인수분해의 성질을 활용하여 N!의 끝에 0이 얼마나 많이 나오는지 구하는 문제