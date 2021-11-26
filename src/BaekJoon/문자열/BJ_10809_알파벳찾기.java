package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10809_알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 알파벳 단어 입력
        String input = br.readLine();
        String arr[] = new String[input.length()];
        char resultArr[] = new char[26];
        int result[] = new int[26];

        for(int i=0; i<result.length; i++){
            result[i] = -1;
        }

        for(int i=0; i<input.length(); i++){
            arr[i] = String.valueOf(input.charAt(i));
        }
        for(int j=0; j<26; j++){
            resultArr[j] = (char)(j+97);
        }

        for(int i=0; i<resultArr.length; i++){
            for(int j=0; j<arr.length; j++){
                /*
                첫번째 if 문
                동일 문자가 포함되어있는 경우 처음 나타난 위치로 나타내야함
                즉, 문자열을 앞에서부터 검사할 때, 앞선 동일문자가 존재하여
                result에 위치를 변경했을 경우는 result의 값을 변경하지 않으면 됨
                이 의미는 결국 -1인 경우에는 배열의 원소 값을 변경하고
                -1이 아닌 경우 배열의 원소 값을 변경하지 않는다.
                 */
                if(result[i] == -1){
                    if(arr[j].charAt(0) == resultArr[i]) {
                        result[i] = j;
                    }
                }
            }
        }
        for(int k : result){
            System.out.println(k);
        }
    }
}
