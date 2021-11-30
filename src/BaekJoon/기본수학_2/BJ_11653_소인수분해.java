package BaekJoon.기본수학_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ_11653_소인수분해 {
    public static void main(String[] args) {
        // 조건 : n이 1인 경우 아무것도 출력하지 않는다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=2;

        while (n >= i){
            if(n%i == 0){
                System.out.println(i);
                n /=i;
            } else {
                i++;
            }
        }
    }
}
