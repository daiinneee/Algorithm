package BaekJoon.기본수학_1;

import java.util.Scanner;

public class BJ_1712_손익분기점 {
    public static void main(String[] args) {
        /*
        최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을
        손익 분기점이라고 한다.
         */
        /*
        ex. A=1000(고정 비용), B=70(가변 비용)
            노트북 한 대 생산하는 데는 총 1,070만원이 들며,
            열 대 생산하는 데는 총 1,700만원이 든다.
        ex. 입력 : 1000 70 170
            출력 : 11
            풀이
            C - B = 100 한 대 생산했을 때 이익
            A에서 이 100을 나누면 1000/100 = 10 이렇게 열 대를 생산해야
            총 지출비용이랑 수입이 같아지는 곳이다.
            +1을 하는 것은 최초로 이득을 보는 구간을 확인하기 위한 것
         */
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int result;
        if(b>=c) {
            result = -1;
        } else {
            result = a / (c-b) + 1;
        }
        System.out.println(result);
    }
}
