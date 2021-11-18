package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GR_약수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 자연수 n 입력
        // ex. 입력 10 -> 1 2 5 10 -> 출력 18
        int n = Integer.parseInt(input);
        int sum = 0;

        for(int i=1; i<=n; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
