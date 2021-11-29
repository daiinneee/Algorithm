package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1316_그룹단어체커_함수 {
    // 주의!
    // 메인 함수와 check 함수에서도 BufferedReader를 쓰므로 반드시 main 함수 밖에
    // 전역 변수로 static을 붙여 Scanner를 생성해주어야 함
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{

        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // check() 메소드를 호출하여 check 메소드가 true라면
            // count를 1 증가 시킨다.
            // (check() == true)와 (check()) 같음
            if (check() == true) {
                count++;
            }
        }
        // 반복문이 끝나면 count 변수를 출력
        System.out.println(count);
    }

    // 그룹 단어를 체크할 함수
    // 단어가 입력되면 해당 문자열이 그룹 단어인지 아닌지만 따지면 되기 때문에
    // return 타입은 boolean
    public static boolean check() throws IOException {
        // 소문자 기준 / 26개의 단어를 체크할 길이 26의 boolean 배열을 선언
        boolean[] check = new boolean[26];
        /*
         prev의 역할은 이후 반복문에서 문자를 꺼내올 때 앞선 문자와 연속되는지,
         아닌지를 판별하기 위함
         1. prev의 문자와 해당 문자가 같다면?
         -> 해당 문자가 중복된 문자인지 여부를 검사하지 않는다.
         2. prev의 문자와 해당 문자가 다르다면?
         -> 해당 문자가 중복된 문자인지 여부를 검사한다.
         */
        int prev = 0;
        // 문자열 입력
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)


            // 앞선 문자와 i 번째 문자가 같지 않다면?(비연속 문자인 경우)
            if (prev != now) {

                // 해당 문자가 처음 나오는 경우 (false 인 경우)
                if ( check[now - 'a'] == false ) {
                    check[now - 'a'] = true;		// true 로 바꿔준다
                    prev = now;					// 다음 턴을 위해 prev 도 바꿔준다
                }

                // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                else {
                    return false;	//함수 종료
                }
            }
            // 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
            // else 문은 없어도 됨
            else {
                continue;
            }
        }
        return true;
    }
}
