package BackJoon.for문;

import java.util.Scanner;

public class BJ_2739_구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while(true){
            n = sc.nextInt();
            if(1<=n && n<=9){
                break;
            } else {
                System.out.println("1~9 사이의 숫자를 입력하세요");
            }
        }
        for(int i=1; i<=9; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
