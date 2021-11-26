package BaekJoon.if문;

import java.util.Scanner;

public class BJ_14681_사분면고르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((0<a && a<=1000)&&(0<b && b<=1000)){
            System.out.println("1");
        } else if((-1000<=a && a<0)&&(0<b && b<=1000)){
            System.out.println("2");
        } else if((-1000<=a && a<0)&&(-1000<=b && b<0)){
            System.out.println("3");
        } else if((0<a && a<=1000)&&(-1000<=b && b<0)){
            System.out.println("4");
        }
    }
}
