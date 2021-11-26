package BaekJoon.for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10950_덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 테스트 케이스의 개수
        int t = Integer.parseInt(input);
        StringTokenizer st;
        String input2;
        int a;
        int b;
        int arr[] = new int[t];

        for(int i=0; i<t; i++){
            input2 = br.readLine();
            st = new StringTokenizer(input2);
            // st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[i] = a+b;
        }
        for(int k : arr){
            System.out.println(k);
        }
    }
}
