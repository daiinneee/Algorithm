package BaekJoon.기본수학_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1978_소수찾기_BufferedReader_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int count = 0;

        for(int i=0; i<n; i++){

            boolean check = true;
            int num = Integer.parseInt(st.nextToken());

            if(num == 1){
                continue;
            }
            for(int j=2; j<num; j++){
                if(num%j == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
            }
        }
        System.out.println(count);
    }
}
