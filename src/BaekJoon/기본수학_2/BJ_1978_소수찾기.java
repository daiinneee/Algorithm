package BaekJoon.기본수학_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_1978_소수찾기 {
    public static void main(String[] args) throws IOException {
        // 소수 찾기
        /*
        입력 : 4
              1 3 5 7
        출력 : 3(1은 소수가 아니다.)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        StringTokenizer st;
        int count = 0;
        int arr[] = new int[n];
        int a;

        // 2 3 4 5
        String input2 = br.readLine();
        st = new StringTokenizer(input2);
        for(int i=0; i<n; i++){
            a = Integer.parseInt(st.nextToken());
//            arr[i] = a;
//            System.out.println(arr[i]);
            for(int j=2; j<=a; j++){
                if(a%j != 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


