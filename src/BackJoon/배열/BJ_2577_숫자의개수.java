package BackJoon.배열;

import java.util.Scanner;

public class BJ_2577_숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // ex. 150
        int b = sc.nextInt(); // ex. 266
        int c = sc.nextInt(); // ex. 427
        // a*b*c의 결과값
        int result = 0;
        result = a*b*c; // ex. 17037300
        String result2 = String.valueOf(result);
        // 8칸짜리 배열
        int arr[] = new int[result2.length()];

        // 7번 반복
        // 배열에 값을 다 담음
        for(int i=0; i<result2.length(); i++) {
            arr[i] = result2.charAt(i);
            for (int j = 0; j < 10; j++) {
                if (arr[i] == j) {

                }
            }
        }
    }
}
