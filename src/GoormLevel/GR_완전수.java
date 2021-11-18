package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GR_완전수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ex. 입력값의 범위 1 100
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i=a; i<=b; i++){
            int sum = 0;
            // ex. 1~100까지 반복문 돌리기
            for(int j=1; j<i; j++){
                // 약수인지 확인
                if(i%j == 0){
                    // 약수라면 1부터 해당 숫자 전까지 더하기
                    sum = sum + j;
                    }
                }
            if(sum == i){
                System.out.print(i + " ");
            }
        }
    }
}
