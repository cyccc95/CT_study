public class PrimeNumSieve {
    static boolean isPrimeNumber(int x){
        int end = (int)Math.sqrt(x);
        for (int i = 2; i <= end; i++){
            if (x % i == 0) return false;
        }
        return true;
    }
    static int number = 100000;
    static int[] a = new int[100001];
    static void primeNumberSieve(){
        for (int i = 2; i <= number; i++){
            a[i] = i;
        }
        for (int i = 2; i <= number; i++){
            if (a[i] == 0) continue;
            for (int j = i + i; j <= number; j += i){
                a[j] = 0;
            }
        }
        for (int i = 2; i <= number; i++){
            if (a[i] != 0) System.out.printf("%d ", a[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(97));
        primeNumberSieve();
    }
}

// 에라토스테네스의 체
// 소수를 대량으로 빠르고 정확하게 구하는 방법

