package BaekJoon.기본수학_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1978_소수찾기_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n은 쓰지 않음
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int count = 0;

        while(st.hasMoreTokens()){
            boolean check = true;
            int num = Integer.parseInt(st.nextToken());

            if(num == 1){
                continue;
            }
            for(int i=2; i<num; i++){
                if(num%i == 0){
                    check = false;
                    break;
                }
            }
            // if(check == true)
            if(check){
                count++;
            }
        }
        System.out.println(count);
    }
}


