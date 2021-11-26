package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11720_숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ex. 5
        int n = Integer.parseInt(br.readLine());
        // ex. 54321
        String input = br.readLine();
        int sum = 0;

        for(int i=0; i<n; i++){
            sum = sum + Character.getNumericValue(input.charAt(i));
        }
        System.out.println(sum);
    }
}
