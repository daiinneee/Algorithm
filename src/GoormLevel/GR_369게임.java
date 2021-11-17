package GoormLevel;

import java.util.Scanner;

public class GR_369게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 게임이 끝난 숫자
        int n = sc.nextInt();
        int cnt = 0;

        // ex. n = 10
        for(int i = 1; i<n; i++){
            // ex. 숫자 1 -> string 1 즉, 문자열 1로 변환
            String str = String.valueOf(i);

            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9'){
                   cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
