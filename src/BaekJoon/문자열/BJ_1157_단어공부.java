package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1157_단어공부 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 문자열 전부 대문자로 변환
        String str = sc.next().toUpperCase();

        // 2. 알파벳 'A' ~ 'Z'는 총 26개
        //    26 크기의 배열 선언
        int[] count = new int[26];

        // 3. 입력 문자열 길이 만큼 반복문 실행
        for (int i = 0; i < str.length(); i++) {
            // 입력 문자열 한 글자씩, 해당 알파벳 순서의 int 배열 count 값 증가
            // 'A'일 경우 -> 'A' - 'A' => 65-65=0 => count배열 0번째 값 증가
            int num = str.charAt(i) -'A' ;
            count[num]++;
        }

        // 4. 알파벳 개수(배열 크기)만큼 반복문 실행
        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            // 가장 중복값이 큰지 비교하며 max에 저장
            if(max < count[i]){
                max = count[i];
                // 해당 위치 알파벳 알아내기 위해 (index + 'A')
                // ex. 1+'A' => 1+65 => 66, 66은 'B'에 해당
                answer = (char)(i+'A');
              // 가장 많이 사용된 단어가 여러개 존재하는 경우에는 ?를 출력
            } else if (max == count[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
