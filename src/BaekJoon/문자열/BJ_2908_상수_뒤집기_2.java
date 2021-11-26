package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2908_상수_뒤집기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder(st.nextToken());
        int a = Integer.parseInt(sb.reverse().toString());

        sb = new StringBuilder(st.nextToken());
        int b = Integer.parseInt(sb.reverse().toString());

        System.out.println(Math.max(a, b));

        // 위와 같음
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//
//        System.out.println(a>b ? a:b);

    }
}
