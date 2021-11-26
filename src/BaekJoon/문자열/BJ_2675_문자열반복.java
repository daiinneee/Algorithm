package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_2675_문자열반복 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for(int i=0; i<t; i++){
//            int r = sc.nextInt();
//            // 주의! nextLine()이 아니라 next()로 받아야 함
//            //      nextLine()은 엔터값을 입력받을 때까지 기준으로 한 줄을 읽어버림
//            //      next()는 공백을 기준으로 하나의 문자열만 읽어들임
//            String s = sc.next();
//
//            for(int j=0; j<s.length(); j++){
//                for(int k=0; k<r; k++){
//                    System.out.print(s.charAt(j));
//                }
//            }
//            System.out.println();
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String input;

        for(int i=0; i<t; i++){
            input = br.readLine();
            st = new StringTokenizer(input);
            // 반복 횟수
            int r = Integer.parseInt(st.nextToken());
            // 문자열
            String s = st.nextToken();

            for(int j=0; j<s.length(); j++){
                for(int k=0; k<r; k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }

}
