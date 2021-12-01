package BaekJoon.그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
그리디 알고리즘 적용하는 문제
어떻게 적용?
-> k원을 만들 때 최소한의 개수를 이용해야 하니 당연하게도
   가장 큰 가치를 지닌 동전부터 선택하는 것이 당연함
   즉, n개의 동전 중 가장 큰 가치를 지닌 동전부터 탐색하여
   동전의 가치가 k보다 클 경우는 넘어가고, 아닐경우는 최대 구성 가능한 개수를 더해주면 됨
 */
public class BJ_11047_동전0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        // n=동전의 종류
        int n = Integer.parseInt(st.nextToken());
        // k=동전의 합
        int k = Integer.parseInt(st.nextToken());
        int coinArr[] = new int[n];

        for(int i=0; i<n; i++){
            int coin = Integer.parseInt(br.readLine());
            coinArr[i] = coin; // 배열에 동전의 종류(얼마짜리인지)가 들어있음
        }
        int count = 0;
        for(int i=n-1; i>=0; i--){
            if(coinArr[i]<=k){
                count = count + (k/coinArr[i]);
                k = k % coinArr[i];
            }
        }
        System.out.println(count);
    }
}
