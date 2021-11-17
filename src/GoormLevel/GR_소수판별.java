package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GR_소수판별 {
    public static void main(String[] args) throws IOException {
//        int count=0;
//        for(int i=2; i<=100; i++){
//            for(int j=2; j<=i; j++){
//                if(i%j == 0){
//                    count ++;
//                }
//            }
//
//            // 핵심 : 1을 제외하고 자기 자신으로 한 번만 나눠질때 소수
//            if(count==1){
//                System.out.print(i+" ");
//            }
//            count=0;
//        }

        /* 소수의 공식 : 선택된 수가 선택된 수보다 작은 수들과 나눠지면 소수가 아님 */
        /* 방법 1
        String number;
        Scanner scan = new Scanner(System.in);
        number = scan.nextLine();
        int A = Integer.parseInt(number);

        Boolean isFindPrime = true;

        for(int i=A-1; i>=2; i--){
            if(A%i == 0){
                isFindPrime = false;
                break;
            }
        }
        System.out.println(isFindPrime == false ? "False" : "True");
        */

        /* 방법 2 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        boolean result = true;

        for(int i = 2; i < n; i++){
            if(n%i == 0){
                result = false;
                // break를 수행하므로 for 문 탈출, 반복문 끝
                break;
            }
        }
        System.out.println(result == false ? "False" : "True");
    }
}
