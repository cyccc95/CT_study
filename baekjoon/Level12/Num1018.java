import java.io.*;
import java.util.StringTokenizer;

public class Num1018 {
    static char[][] chess1 = {
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
    };
    static char[][] chess2 = {
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
    };
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] input = new char[n][m];
        for (int i = 0; i < n; i++){
            String str = br.readLine();
            for (int j = 0; j < m; j++){
                input[i][j] = str.charAt(j);
            }
        }

        int answer = n * m;
        for (int i = 0; i < n - 7; i++){
            for (int j = 0; j < m - 7; j++){
                int count1 = 0, count2 = 0;
                for (int x = 0, i2 = i; x < 8; x++, i2++){
                    for (int y = 0, j2 = j; y < 8; y++, j2++){
                        if (input[i2][j2] != chess1[x][y]){
                            count1++;
                        }
                        if (input[i2][j2] != chess2[x][y]){
                            count2++;
                        }
                    }
                }
                if (count1 < answer){
                    answer = count1;
                }
                if (count2 < answer){
                    answer = count2;
                }
            }
        }
        bw.write(Integer.toString(answer));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 체스판을 만드는 모든 경우를 시도하여 최적의 방법을 찾는 문제