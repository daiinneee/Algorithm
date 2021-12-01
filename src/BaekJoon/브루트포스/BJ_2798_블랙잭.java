package BaekJoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1. n개의 숫자 중 3개를 합하고, m을 넘지 않는 최댓값을 찾는 문제
2. 3증 for문으로 각 합을 구하고, 최댓값을 찾아 출력
 */
public class BJ_2798_블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 5 21  5장의 카드, m은 21
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken()); // n
        int m = Integer.parseInt(st.nextToken()); // m
        // 5 6 7 8 9 (세 카드의 합이 21을 넘지 않는 -> 6 + 7 + 8 = 21
        String num = br.readLine();
        // 처음에 new StringTokenizer(num)으로 작성 -> 에러!
        st = new StringTokenizer(num);
        int arr[] = new int[n];
        int max = 0;

        // 5 6 7 8 9 -> 배열에 담기
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        // 3개를 고르기 때문에 첫번째 카드는 n-2까지만 순회
        for(int i=0; i<arr.length; i++){
            // 첫 번째 카드가 m보다 크면 skip
            if(arr[i]>m) continue;
            // 두 번째 카드는 첫 번째 카드 다음부터 n-1까지만 순회
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] > m) continue;
                // 세 번째 카드는 두 번째 카드 다음부터 n까지 순회
                for(int k=j+1; k<arr.length; k++){
                    // 3개 카드의 합
                    int sum = arr[i] + arr[j] + arr[k];
                    // 3개의 카드 합이 이전 합 보다 크면서 m보다 작거나 같으면 됨
                    if(sum > max && sum <=m){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
