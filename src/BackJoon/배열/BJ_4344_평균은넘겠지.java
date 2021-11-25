package BackJoon.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_4344_평균은넘겠지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 테스트 케이스의 개수
        int c = Integer.parseInt(input);
        StringTokenizer st;

        for(int i=0; i<c; i++){
            st = new StringTokenizer(br.readLine());
            // 학생 수
            int n = Integer.parseInt(st.nextToken());
            int arr[] = new int[n];

            double sum = 0;
            for(int j=0; j<n; j++){
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum = sum + val;
            }

            double avg = (sum/n);
            double count = 0;

            // 평균 넘는 학생 비율 찾기
            for(int j=0; j<n; j++){
                if(arr[j] > avg){
                    count++;
                }
            }
            //double result = (count/n)*100;
            //System.out.println(Math.round(result*1000)/1000.0);
            // %% -> 특수문자 % 나타내기
            System.out.printf("%.3f%%\n", (count/n)*100);
        }
    }
}
