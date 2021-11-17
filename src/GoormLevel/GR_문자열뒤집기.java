package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GR_문자열뒤집기 {
    public static void main(String[] args) throws IOException {
        // 입력할 문자열의 길이
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 문자열 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String arr[] = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = String.valueOf(input.charAt(i));
        }

        // 에러 발생
        // for(int i = arr.length; i>0; i--){
        // 원인 : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
