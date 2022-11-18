import java.io.*;

public class Num2447 {
    static char[][] arr;

    static void star(int x, int y, int n, boolean blank){
        // 공백칸일 경우
        if (blank) {
            for (int i = x; i < x + n; i++){
                for (int j = y; j < y + n; j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        // 더이상 쪼갤 수 없는 블록일 때
        if (n == 1){
            arr[x][y] = '*';
            return;
        }
        /*
            n=27일 경우 한 블록의 사이즈는 9이고,
            n=9일 경우 한 블록의 사이즈는 3이듯
            해당 블록의 한 칸을 담을 변수를 의미 size

            count는 별 출력 누적을 의미
         */

        int size = n / 3;
        int count = 0;
        for (int i = x; i < x + n; i += size){
            for (int j = y; j < y + n; j += size){
                count++;
                if (count == 5){ // 공백 칸일 경우
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        arr = new char[n][n];

        star(0, 0, n, false);

        for (int i = 0; i < n; i++){
            bw.write(arr[i]);
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

// 재귀적인 패턴을 재귀함수로 찍는 문제