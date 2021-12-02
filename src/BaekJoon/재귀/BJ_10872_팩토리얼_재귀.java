package BaekJoon.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
참고로 n의 범위가 0~12 이기 때문에 int로도 가능하지만,
13을 넘어가면 13!=6227020800으로 int형의 범위를 벗어나기 때문에
long 타입으로 해주어야 함

재귀함수란?
재귀 함수란 어떤 함수에서 자신을 다시 호출하여 작업을 수행하는 방식의 함수를 의미
다른 말로는 호출, 되부름이라고 부르기도 하며, 반복문을 사용하는 코드는 항상
제귀 함수를 통해 구현하는 것이 가능하면 그 반대도 가능
 */
public class BJ_10872_팩토리얼_재귀 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = factorial(n);
        System.out.println(sum);

    }
    public static int factorial(int n){
        if(n<=1) return 1; // 재귀 종료조건
        return n * factorial(n-1);
    }

}
