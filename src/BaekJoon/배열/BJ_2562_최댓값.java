package BaekJoon.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2562_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int arr[] = new int[9];
        int max = arr[0];
        // 몇 번째인지를 저장하기 위한 변수
        int index = 0;

        for(int i=0; i<9; i++){
            a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        for(int i=0; i<9; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println((index+1));
    }
}
