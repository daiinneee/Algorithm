package GoormLevel;

/*
- 출력 -
3 짝
6 짝
9 짝
...
33 짝짝
...
36 짝짝
...
99 짝짝
끝
 */
public class GR_369게임_calcul {
    public static void main(String[] args) {
        int num = 100; // 1~100까지의 숫자

        // 1~100까지 중 3 6 9 포함된 숫자 있는지 확인
        for(int i=1; i<=num; i++){
            // calcul() 함수 호출
            // 처음에 숫자 1부터 확인
            // ex. calcul(1)
            int count = calcul(i);
            if(count == 0){
                System.out.println("");
                // continue를 수행하므로 for문 처음으로 다시 돌아감
                // 만약 break를 사용했다면 for 문 탈출
                continue;
            }
            System.out.println(i + " ");

            for(int j=0; j<count; j++){
                System.out.println("짝");
            }
            System.out.println();
        }
    }

    // calcul 메소드
    // ex. calcul(1) 호출
    //     int num = 1;
    public static int calcul(int num){
        int count = 0;
        String chkNum = "";
        // 숫자를 String형으로 변환
        chkNum = String.valueOf(num);

        /* 방법 1
        // 3 6 9 들어 있는지 확인
        for(int i=0; i<chkNum.length(); i++){
            // char -> int로 변환
            // Character.getNumericValue() 함수 사용!
            int result = Character.getNumericValue(chkNum.charAt(i));
            // 검색한 숫자가 0일때
            if(result==0){
                count--;
            }
            if(result%3==0 || result%6==0 || result%9==0){
                count++;
            }
        } */

        /* 방법 2 */
        for(int i=0; i<chkNum.length(); i++){
            if(chkNum.charAt(i) == '3' || chkNum.charAt(i) == '6' || chkNum.charAt(i) == '9'){
                count++;
            }
        }
        return count;
    }
}
