package BackJoon.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 과목의 수
        int n = Integer.parseInt(input);
        StringTokenizer st = new StringTokenizer(br.readLine());
        double arr[] = new double[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 오름차순 정렬
        Arrays.sort(arr);

        // ex. 40 60 80 순으로 정렬됨
        double sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + ((arr[i]/arr[n-1])*100);
        }
        System.out.println(sum/n);
    }
}
