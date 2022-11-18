import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Num11729 {
    static List<Integer> list = new ArrayList<>();
    static int count;
    static void move(int n, int x, int y){
        if (n > 1) {
            move(n - 1, x, 6 - x - y);
        }
        list.add(x); list.add(y); count++;
        if (n > 1){
            move(n - 1, 6 - x - y, y);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        move(n,1,3);

        bw.write(Integer.toString(count) + "\n");
        for (int i = 0; i < list.size(); i++){
            if (i > 0 && i % 2 == 0){
                bw.write("\n" + Integer.toString(list.get(i)) + " ");
            } else {
                bw.write(Integer.toString(list.get(i)) + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 재귀적인 패턴을 찾아서 재귀함수로 찍는 문제