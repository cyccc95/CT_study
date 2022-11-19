import java.io.*;
import java.util.StringTokenizer;

public class Num2798 {
    static int blackJack(int[] cards, int m){
        int sum = 0;

        for (int i = 0; i < cards.length - 2; i++){
            for (int j = i + 1; j < cards.length - 1; j++){
                for (int k = j + 1; k < cards.length; k++){
                    if (cards[i] + cards[j] + cards[k] > sum && cards[i] + cards[j] + cards[k] <= m){
                        sum = cards[i] + cards[j] + cards[k];
                        break;
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] cards = new int[n];

        String card = br.readLine();
        st = new StringTokenizer(card, " ");
        for (int i = 0; i < n; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(Integer.toString(blackJack(cards, m)));

        br.close();
        bw.flush();
        bw.close();
    }
}

// 세 장의 카드를 고르는 모든 경우를 고려하는 문제
