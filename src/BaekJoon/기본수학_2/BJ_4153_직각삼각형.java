package BaekJoon.기본수학_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        // 3 4 5 -> 직각삼각형 -> 9+16=25
        // Math.pow(3,2) 3의 2제곱 -> 9
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[3];
        List<String> arrList = new ArrayList<>();

        for(int i=0; i<29999; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0){
                break;
            }

            // 세 변의 길이(a, b, c)중 어느 길이가 대각선 변인지 모르기 때문에
            // 아래 3개의 조건을 다 검사한다.
            if((Math.pow(a,2) + Math.pow(b,2)) == Math.pow(c,2) ||
               (Math.pow(a,2) + Math.pow(c,2)) == Math.pow(b,2) ||
               (Math.pow(b,2) + Math.pow(c,2)) == Math.pow(a,2)){
                arrList.add("right");
            } else {
                arrList.add("wrong");
            }
        }

        for(int i=0; i<arrList.size(); i++){
            System.out.println(arrList.get(i));
        }
    }
}
