import java.io.*;
import java.util.StringTokenizer;

public class Num24060 {
    static int[] sorted;
    static int count;
    static int k;
    static int answer;

    static void mergeSort(int[] arr, int k){
        count = 0;
        sorted = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
        sorted = null;
    }

    static void mergeSort(int[] arr, int left, int right){
        if (left == right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void check(int[] sorted, int idx){
        if (count == k) answer = sorted[idx - 1];
    }

    static void merge(int[] arr, int left, int mid, int right){
        int l = left;
        int r = mid + 1;
        int idx = left;
        while (l <= mid && r <= right){
            if (arr[l] <= arr[r]){
                sorted[idx] = arr[l];
                idx++; l++; count++;
                check(sorted, idx);
            } else {
                sorted[idx] = arr[r];
                idx++; r++; count++;
                check(sorted, idx);
            }
        }
        if (l > mid){
            while(r <= right){
                sorted[idx] = arr[r];
                idx++; r++; count++;
                check(sorted, idx);
            }
        } else {
            while(l <= mid){
                sorted[idx] = arr[l];
                idx++; l++; count++;
                check(sorted, idx);
            }
        }
        for (int i = left; i <= right; i++){
            arr[i] = sorted[i];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n, k 입력
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        // arr 입력
        int[] arr = new int[n];
        String data = br.readLine();
        st = new StringTokenizer(data, " ");
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, k);

        if (count < k){
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }

        br.close();
    }
}

// 재귀를 활용하여 정렬하는 방법을 배우는 문제
