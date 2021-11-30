package BaekJoon.기본수학_2;

import java.util.Scanner;
/*
소수 찾기 방법 3가지 -> 노션에 정리
 */
public class BJ_1978_소수찾기_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i=0; i<n; i++){
            // 소수인 경우 true, 아닌 경우 false
            boolean check = true;
            int num = sc.nextInt();

            // 입력한 숫자가 1인 경우
            // 다음 반복으로 넘어감(for문의 경우 증감식으로 이동)
            if(num == 1){
                continue;
            }
            for(int j=2; j<num; j++){
                if(num%j == 0){
                    // 소수가 아니므로 check의 값을 false로 변경
                    check = false;
                    break;
                }
            }
            // 소수인 경우 count 값 1 증가
            // true : 소수
            if(check){
                count++;
            }
        }
        System.out.println(count);
    }
}
