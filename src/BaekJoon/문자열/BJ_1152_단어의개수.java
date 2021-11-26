package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1152_단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // StringTokenizer 기본이 공백 기준으로 나누어 토큰에 저장
        StringTokenizer st = new StringTokenizer(input);
        System.out.println(st.countTokens());
    }
}
