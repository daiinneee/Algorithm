package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2941_크로아티아알파벳 {
    public static void main(String[] args) throws IOException {
//        에러 코드 : StringIndexOutOfBoundsException 에러 발생
//        이유 :
//        해결 방법 :
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        int count = 0;
//        for(int i=0; i<input.length(); i++){
//           if(input.charAt(i) == 'l' || input.charAt(i) == 'n'){
//               if(input.charAt(i+1) == 'j' || input.charAt(i+1) == 'i'){
//                   count = count + 1;
//                   i++;
//               } else {
//                   count = count + 1;
//               }
//           } else if(input.charAt(i) == 'c'){
//               if(input.charAt(i+1) == '=' || input.charAt(i+1) == '-'){
//                   count = count + 1;
//                   i++;
//               } else {
//                   count = count + 1;
//               }
//           } else if(input.charAt(i) == 's' || input.charAt(i) == 'z'){
//               if(input.charAt(i+1) == '='){
//                   count = count + 1;
//                   i++;
//               } else {
//                   count = count + 1;
//               }
//           } else if(input.charAt(i) == 'd'){
//               if(input.charAt(i+1) == 'z' && input.charAt(i+2) == '='){
//                   count = count + 1;
//                   i+=2;
//               } else {
//                   count = count + 1;
//               }
//           } else {
//               count = count + 1;
//           }
//        }
//        System.out.println(count);
//

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int len = str.length();
        int count = 0;

        for (int i = 0; i < len; i++) {

            char ch = str.charAt(i);

            // 현재 i의 값이 문자열 길이에서 -1 값보다 작을 경우에만 조거문 실행
            if(ch == 'c' && i < len - 1) { // 만약 ch 가 c 라면?
                //만약 ch 다음 문자가 '=' 또는 '-' 이라면?
                if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    // i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                    i++;
                }

            }

            else if(ch == 'd' && i < len - 1) {
                if(str.charAt(i + 1) == '-') {	// d- 일 경우
                    i++;
                }
                // dz= 를 검사할 때는 i가 str.length - 2 보다 작아야 함
                else if(str.charAt(i + 1) == 'z' && i < len - 2) {

                    if(str.charAt(i + 2) == '=') {	// dz= 일 경우
                        i += 2;
                    }
                }
            }

            else if((ch == 'l' || ch == 'n') && i < len - 1) {
                if(str.charAt(i + 1) == 'j') {	// lj 또는 nj 일 경우
                    i++;
                }
            }


            else if((ch == 's' || ch == 'z') && i < len - 1) {
                if(str.charAt(i + 1) == '=') {	// s= 또는z= 일 경우
                    i++;
                }

            }

            // 해당 반복문이 종료될 때마다 count 변수를 1 증가 시킴
            count++;

        }

        System.out.println(count);
    }
}