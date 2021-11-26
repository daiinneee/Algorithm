package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2908_상수_뒤집기_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        // 748
        String a = st.nextToken();
        // 893
        String b = st.nextToken();
        String aa = "";
        String bb = "";

        for(int i=a.length()-1; i>=0; i--){
            aa = aa + a.charAt(i);
        }
        for(int j=b.length()-1; j>=0; j--){
            bb = bb + b.charAt(j);
        }
        if(Integer.parseInt(aa) > Integer.parseInt(bb)){
            System.out.println(aa);
        } else {
            System.out.println(bb);
        }
        // if else 코드 줄이기
        // System.out.print(Integer.parseInt(aa) > Integer.parseInt(bb) ? Integer.parseInt(aa):Integer.parseInt(bb)
    }
}
