package BaekJoon.for문;

import java.util.Scanner;

public class BJ_2742_기찍N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=n; i>0; i--){
            System.out.println(i);
        }

        // 방법2
        // while(n > 0){
        //    System.out.println(n);
        //    n--;
        // }
    }
}
