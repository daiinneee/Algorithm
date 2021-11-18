package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GR_n구하기 {
    // 1~44까지 더하면 1000미만, 1~45까지 더하면 1000이상
    // 입력한 숫자를(다 더한 수) 넘어가는 숫자 n을 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 입력 숫자
        // ex. 1000
        int m = Integer.parseInt(input);
        int sum = 0;

        for(int i=1; i<=10000; i++){
            sum = sum + i; // 1+2+...
            if(sum >= m){
                System.out.println(i);
                break;
            }
        }

    }
}

