package BackJoon.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ_2577_숫자의개수_2 {
    public static void main(String[] args) {

        // 방법1
        Scanner in = new Scanner(System.in);

        int value = (in.nextInt() * in.nextInt() * in.nextInt());
        String str = Integer.toString(value);
        in.close();

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                // str.charAt(j) - '0' : 문자(char)를 정수(int)형으로 바꾸기
                if ((str.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }

//    방법2
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    int[] arr = new int[10];
//
//    int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
//
//    String str = String.valueOf(val);
//
//		for (int i = 0; i < str.length(); i++) {
//        arr[(str.charAt(i) - 48)]++;
//    }
//
//		for (int v : arr) {
//        System.out.println(v);
//    }
//
//}
}
