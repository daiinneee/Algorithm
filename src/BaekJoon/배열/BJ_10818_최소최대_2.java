package BaekJoon.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_10818_최소최대_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫번째 숫자 입력 ex. 5
        int n = Integer.parseInt(br.readLine());
        // 여러 숫자 입력 ex. 20 10 35 30 7
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        int index = 0;
        // arr[]에 숫자 하나씩 넣기
        while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        // 정렬 기본 : 오름차순
        Arrays.sort(arr);
        // 배열 첫번째 요소의 값 : 가장 작은 수
        // 배열 마지막 요소의 값 : 가장 큰 수
        System.out.println(arr[0] + " " + arr[n-1]);
    }
}
