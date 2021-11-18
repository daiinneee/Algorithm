package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GR_완전제곱수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 줄에 입력할 총 개수 입력
        String input = br.readLine();
        int n = Integer.parseInt(input);
        int count = 0;

        // 총 개수 만큼 숫자 입력
        for(int i=0; i<n; i++){
            int m = Integer.parseInt(br.readLine());
            // Java의 래퍼 클래스인 Double에 있는
            // 정수를 반환하는 intValue() 메소드를 사용
            Double sqrt = Math.sqrt(m);
            // System.out.println(sqrt);
            // 49 입력 -> 7.0 출력, 10 입력 -> 3.16227766... 출력
            System.out.println(sqrt.intValue());
            if(sqrt == sqrt.intValue()){
                // System.out.println(sqrt.intValue());
                // 49 입력 -> sqrt.intValue() : 7 출력
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
package Programmers;

public class PG_정수제곱근판별 {
    public static void main(String[] args) {
        int n = 36;
        Double sqrt = Math.sqrt(n);

        if(sqrt == sqrt.intValue()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
 */