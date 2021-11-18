package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GR_대소문자바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ex. 입력 : aaaaDDDD
        String input = br.readLine();
        String result = "";

        // string 관련 함수
        // toUpperCase(), toLowerCase()
        for(int i=0; i<input.length(); i++){
            if((65 <= input.charAt(i)) && (input.charAt(i) <= 90)){ // 문자가 대문자인 경우
                // toLowerCase() 함수를 이용해 소문자로 변환
                result += String.valueOf(input.charAt(i)).toLowerCase();
            } else if ((97 <= input.charAt(i)) && (input.charAt(i) <=122 )){ // 문자가 소문자인 경우
                // toUpperCase() 함수를 이용해 대문자로 변환
                result += String.valueOf(input.charAt(i)).toUpperCase();
            } else { // 대문자 소문자와 관련 없는 문자인 경우
                result += input.charAt(i);
            }
        }
        System.out.println(result);
    }
}
