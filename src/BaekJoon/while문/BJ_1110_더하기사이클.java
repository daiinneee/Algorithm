package BaekJoon.while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1110_더하기사이클 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // n의 사이클 길이
        int n = Integer.parseInt(input);
        int temp = n;
        int count = 0;

        // 언제까지 반복하느냐?
        while (true) {
            int left = temp / 10;
            int right = temp % 10;
            temp = right * 10 + (left + right) % 10;
            count++;
            if (n == temp) {
                break;
            }
        }
        System.out.println(count);
//            // 입력 : 26
//            // 입력 : 68
//            for (int i = 0; i < input.length(); i++) {
//                sum = sum + Character.getNumericValue(input.charAt(i));
//                System.out.println("sum :: " + sum);
//                // sum :: 8
//                // sum :: 14
//                if (i == 1 && sum >= 10) {
//                    //System.out.println(input.charAt(i));
//                    //System.out.println(String.valueOf(sum).charAt(i));
//                    //System.out.println((input.charAt(i)) + String.valueOf(String.valueOf(sum).charAt(i)));
//                    result = (input.charAt(i)) + String.valueOf(String.valueOf(sum).charAt(i));
//                } else if (i == 1 && sum < 10) {
//                    //System.out.println(input.charAt(i) + String.valueOf(sum));
//                    result = input.charAt(i) + String.valueOf(sum);
//                }
//            }
//        }
    }
}

