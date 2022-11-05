import java.util.Scanner;

public class Num10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int H, W, N;
        String[] answer = new String[T];

        for(int i = 0; i < T; i++){
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();
            if(N % H == 0){
                answer[i] = Integer.toString(H);
                if((N / H) < 10){
                    answer[i] += ("0" + Integer.toString(N / H));
                }  else {
                    answer[i] += Integer.toString(N / H);
                }
            } else {
                answer[i] = Integer.toString(N % H);
                if((N / H) + 1 < 10){
                    answer[i] += ("0" + Integer.toString((N / H) + 1));
                }  else {
                    answer[i] += Integer.toString((N / H) + 1);
                }
            }
        }
        for(int i = 0; i < T; i++){
            System.out.println(answer[i]);
        }
    }
}

// 호텔 방 번호의 규칙을 찾아 출력하는 문제
