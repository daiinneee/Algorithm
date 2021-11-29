package BaekJoon.문자열;

import java.util.Scanner;

public class BJ_1316_그룹단어체커_일반 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 그룹 단어 개수
        int cnt = 0;

        for(int i=0; i<n; i++){
            String s = sc.next();
            // 알파벳 사용 내역
            // boolean 배열 초기값 false!
            boolean check[] = new boolean[26];
            // 그룹 단어 인지
            boolean tmp = true;

            for(int j=0; j<s.length(); j++){
                int index = s.charAt(j)-'a';
                // 이전에 사용한적이 있는 문자라면
                // if(true)
                if(check[index]){
                    // 이전 문자와 연속되지 않는다면
                    if(s.charAt(j) != s.charAt(j-1)){
                        // 그룹 단어가 아님
                        tmp = false;
                        break;
                    }
                // 이전에 사용한적이 없는 문자라면
                } else {
                    // 문자 사용 체크
                    check[index] = true;
                }
            }
            // tmp -> true라면(그룹 단어라면) -> cnt 증가
            if(tmp){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
