import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        int[][] arr = new int[6][2];

        for (int i = 0; i < 6; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[][] sortedArr = arr.clone();

        Arrays.sort(sortedArr, (o1, o2) -> {
            return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
        });

        int x1 = 0, y1 = 0; // 전체 크기
        int x2 = 0, y2 = 0; // 뺄 크기

        x1 = Math.max(sortedArr[0][1], sortedArr[1][1]);
        x1 = Math.max(x1, sortedArr[2][1]);
        y1 = Math.max(sortedArr[3][1], sortedArr[4][1]);
        y1 = Math.max(y1, sortedArr[5][1]);

        // arr에서 x1과 y1의 index 찾기
        int indexOfX1 = 0, indexOfY1 = 0;
        for (int i = 0; i < 6; i++){
            if((arr[i][0] == 1 || arr[i][0] == 2) && arr[i][1] == x1){
                indexOfX1 = i;
            }
            if((arr[i][0] == 3 || arr[i][0] == 4) && arr[i][1] == y1){
                indexOfY1 = i;
            }
        }

        if(indexOfX1 == 0){
            x2 = Math.abs(arr[1][1] - arr[5][1]);
        } else if (indexOfX1 == 5){
            x2 = Math.abs(arr[4][1] - arr[0][1]);
        } else {
            x2 = Math.abs(arr[indexOfX1 - 1][1] - arr[indexOfX1 + 1][1]);
        }
        if(indexOfY1 == 0){
            y2 = Math.abs(arr[1][1] - arr[5][1]);
        } else if (indexOfY1 == 5){
            y2 = Math.abs(arr[4][1] - arr[0][1]);
        } else {
            y2 = Math.abs(arr[indexOfY1 - 1][1] - arr[indexOfY1 + 1][1]);
        }

        bw.write(Integer.toString(((x1 * y1) - (x2 * y2)) * k));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 특정한 형태의 도형의 넓이를 구하는 문제