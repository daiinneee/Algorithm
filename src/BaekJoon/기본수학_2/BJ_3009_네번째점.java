package BaekJoon.기본수학_2;

import java.util.Scanner;

public class BJ_3009_네번째점 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // x1 = 30, x2 = 10, x3 = 10
        // y1 = 20 y2 = 10, y3 = 20
        // 30 20
        int x1= sc.nextInt();
        int y1= sc.nextInt();

        // 10 10
        int x2= sc.nextInt();
        int y2= sc.nextInt();

        // 10 20
        int x3= sc.nextInt();
        int y3= sc.nextInt();

        int x = x1; // 30
        int y = y1; // 20

        if(x1==x2) {
            x=x3;
        }
        if(x1==x3) {
            x=x2;
        }

        if(y1==y2) {
            y=y3;
        }
        if(y1==y3) {
            y=y2; // y=10
        }

        System.out.println(x+" "+y);
        sc.close();
    }
}
