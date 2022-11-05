public class Num15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i <a.length; i++){
            ans += a[i];
        }
        return ans;
    }
}

// 정수 N개의 합 함수 구현