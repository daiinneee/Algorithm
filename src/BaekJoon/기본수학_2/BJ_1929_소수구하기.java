package BaekJoon.기본수학_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 정상적인 코드, but 시간초과!
// -> 에라토스테네스의 체를 이용하여
public class BJ_1929_소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean check = true;

        // ex. 3~16 사이의 소수 구하기
        for(int i=m; i<=n; i++){
            if(i == 1){
                continue;
            }
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if(check){
                System.out.println(i);
            }
        }

    }
}
