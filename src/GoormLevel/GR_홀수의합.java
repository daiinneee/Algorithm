package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GR_홀수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ex. 10 100
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        // ex. 10
        int a = Integer.parseInt(st.nextToken());
        // ex. 100
        int b = Integer.parseInt(st.nextToken());
        int sum = 0;

        // 10과 100사이의 홀수의 합
        for(int i=a; i<=b; i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
