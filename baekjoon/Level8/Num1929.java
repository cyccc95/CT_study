import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for (int i = a; i <= b; i++){
            if(isPrime(i)) {
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int num){
        if(num == 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(int i = 3; i <= (int)Math.sqrt(num); i += 2){
            if(num % i == 0) return false;
        }
        return true;
    }
}

// 더 빠르게 소수를 판별하는 문제
