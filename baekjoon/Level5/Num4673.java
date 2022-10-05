public class Num4673 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10000; i++) {
            int j = 1;
            while(j <= i) {
                if(i == dn(j)) {
                    break;
                }
                if(j == i) {
                    System.out.println(i);
                }
                j++;
            }

        }
    }

    static int dn(int num){
        int sum = num;
        while(num > 0) {
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}

// 함수 d를 정의하여 셀프 넘버 구하기