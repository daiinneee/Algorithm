package GoormLevel;

import java.util.Random;
import java.util.Scanner;

public class GR_야구게임 {
    /*
    문제
    0~9까지의 10개의 숫자를 사용
    중복 허용 X, 한 사람이 3개의 숫자를 뽑아서 기억
    맞추는 사람은 3개의 숫자를 골라서 말하는데, 기억한 숫자들과
    어떤 관계가 있는지 알려줌
    쉽게 말해, 맞추는 사람이 고른 숫자 중에서 몇 개가 존재하는지,
    자리가 맞는지 알려줌
    숫자가 있으면 Ball, 자리도 같으면 Strike라고 함
     */
    
    /* 
    예시
    1 2 3이 정답이라고 가정
    맞추는 사람이 2 5 6이라고 하면, 정답 중에 2는 포함하고 있는데 자리가 다름
    이 때, 술래는 1 Ball이라고 함
    맞추는 사람이 5 2 6이라고 하면, 정답 중에 2는 자릿수까지 일치함
    이 때, 술래는 1 Strike라고 함
    이처럼 맞추는 사람이 숫자를 계속해서 질문하고, 3 Strike를 만들면 게임이 끝남
     */

    // 컴퓨터 값 랜덤
    // 사용자 값 스캐너 입력
    public static void main(String[] args) {
        // 컴퓨터
        int[] com = new int[3];
        // 사용자
        int[] user = new int[3];
        // 배열 인덱스를 위해서 사용하는 변수
        int num = 0;
        // 몇번에 맞추는지 세기 위한 변수
        int count = 0;
        boolean loop = true;
        int strike = 0;
        int ball = 0;
        // Random rd = new Random();

        // 1. 배열의 길이 만큰 for문을 돌리면서 난수를 넣고,
        //    중복 검사
        for(int i=0; i<com.length; i++){
            com[i] = (int) (Math.random()*9) + 1;
            // 중복 검사
            // 중복 발생하면 다시 위의 반복문으로 돌아가 랜덤 숫자 다시 생성
            for(int j=0; j<i; j++){
                if(com[j] == com[i]){
                 i--;
                 break;
                }
            }
        }

        // 2. user가 세 개의 정수를 입력하도록 하여
        //    user 배열에 숫자를 넣도록 함
        Scanner sc = new Scanner(System.in);
        System.out.println("1~9 사이의 정수를 입력하세요");

        // 3. com의 배열과 user 배열을 서로 비교하여 Strike인지 Ball인지 구분
        loop = true;
        while(loop) {
            for(int i=0; i<user.length; i++){
                num = sc.nextInt();
                user[i] = num;
                if(num < 0 || num > 10){
                    System.out.println("1~9의 정수를 입력하세요");
                }
            }
            for(int i=0; i<com.length; i++){
                for(int j=0; j<user.length; j++){
                    // 배열의 위치(인덱스)와 배열의 값이 일치해야 strike
                    if(com[i] == user[j] && i == j){
                        strike++;
                    // 배열의 값만 같다면 ball
                    } else if(com[i] == user[j] && i != j) {
                        ball++;
                    }
                }
            }
            System.out.println(strike + "스트라이크" + " " + ball + "볼");
            strike = 0;
            ball = 0;

            if(strike >= 3){
                loop = false;
            }
            count = count + 1;
        }
        System.out.println("횟수 : " + (count - 1));
        System.out.println("Game Over");
        sc.close();
    }
}
