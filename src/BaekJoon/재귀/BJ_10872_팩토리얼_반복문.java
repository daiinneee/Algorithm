package BaekJoon.재귀;

import java.util.Scanner;

public class BJ_10872_팩토리얼_반복문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 5
        int n = sc.nextInt();
        // 5*4*3*2*1
        int sum = 1;

        for(int i=n; i>=1; i--){
            sum = sum*i;
        }
        System.out.println(sum);
    }
}
