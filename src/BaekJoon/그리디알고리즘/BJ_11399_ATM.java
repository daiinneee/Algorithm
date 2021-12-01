package BaekJoon.그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 출력
 */
public class BJ_11399_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n=5, 다섯 사람
        int n = Integer.parseInt(br.readLine());
        // 3 1 4 3 2, 각 사람이 돈을 인출하는데 필요한 시간
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            int time = Integer.parseInt(st.nextToken());
            arr[i] = time;
            // arr[0]=3 arr[1]=1 arr[2]=4 arr[3]=3 arr[4]=2
        }

        // 배열 오름차순 정렬
        Arrays.sort(arr);
        // arr[0]=1 arr[1]=2 arr[2]=3 arr[3]=3 arr[4]=4

        // 사람별 대기시간 총합
        int sum = 0;
        // 이전까지의 대기시간 누적합
        int prev = 0;

        for(int i=0; i<arr.length; i++){
            // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해줌
            sum = sum + prev + arr[i];
            // 이전까지의 누적합에 현재 걸리는 시간을 더해줌
            prev = prev + arr[i];
        }
        System.out.println(sum);
    }
}
