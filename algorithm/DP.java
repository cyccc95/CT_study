public class DP {
    static int fibonacci(int x){
        if (x == 1) return 1;
        if (x == 2) return 1;
        if (d[x] != 0) return d[x];
        return d[x] = fibonacci(x - 1) + fibonacci(x - 2);
    }
    static int[] d = new int[100];
    public static void main(String[] args) {
        System.out.println(fibonacci(30));
    }
}

// Dynamic Programming
// 하나의 문제는 단 한 번만 풀도록 하는 알고리즘

// 다이나믹 프로그래밍을 사용할 수 있는 가정
// 1. 큰 문제를 작은 문제로 나눌 수 있습니다
// 2. 작은 문제에서 구한 정답은 그것을 포함하는 큰 문제에서도 동일합니다

// 즉, 크고 어려운 문제가 있으면 그것을 먼저 잘게 나누어서 해결한 뒤에 처리하여
// 나중에 전체의 답을 구하는 것입니다. 다만 이 과정에서 메모이제이션(Memoization)이
// 사용된다는 점에서 분할 정복과 다릅니다. 이미 계산한 결과는 배열에 저장함으로써 나중에
// 동일한 계산을 해야 할 때는 저장된 값을 단순히 반환하기만 하면 되는 것입니다.