package BaekJoon.기본수학_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2581_소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        // min의 초기값을 n 즉, 최대값으로 초기화
        int min = n;

        for(int i=m; i<=n; i++){
            boolean check = true;
            // 1은 소수가 아님
            if(i == 1){
                continue;
            }
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    check = false;
                    break;
                } else {
                    check = true;
                    /*
                    아래 최솟값 코드를 여기에 넣게 되면
                    2일때는 위의 for문을 실행하지 않기 때문에
                    1~10 사이의 소수 중 최솟값을 뽑아보면 min은 3이 됨
                    if(min>i){
                        min = i;
                    }
                     */
                }
            }
           if(check){
               if(min>i){
                   min = i;
               }
               sum = sum + i;
           }
        }
        if(sum == 0){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}

