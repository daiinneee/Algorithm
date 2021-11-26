package BaekJoon;

import java.util.Scanner;

public class BJ_9093_단어뒤집기 {
    /*
    문제
    문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오.
    단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] array = str.split(" ");

            for (int j = 0; j < array.length; j++) {
                System.out.print(new StringBuffer(array[j]).reverse() + " ");
            }
            System.out.println();
        }
        sc.close();

//        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());
//        String[] results = new String[t]; // 결과를 담을 배열
//
//        for (int i = 0; i < t; i++) {
//            String word = sc.nextLine();
//            String[] wordArr = word.split(" ");
//            StringBuilder result = new StringBuilder();
//            for (String words : wordArr) {
//                for (int j = words.length(); j > 0; j--) {
//                    result.append(words.charAt(j-1));
//                }
//                result.append(" ");
//            }
//            results[i] = result.toString();
//        }
//
//        for (String result : results) {
//            System.out.println(result);
//        }

        /*
        1. 문자를 입력 받는다
        2. 문자를 ""를 기준으로 나눈다(split 사용)
        3. 나눈 문자를 새로운 배열에 넣는다
        4. 배열의 첫번쨰 요소부터 문자를 역순을 뽑고 출력한다
        */
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine(); //엔터제거
//
//        for(int i=0;i<n;i++) {
//            String str1=sc.nextLine();
//            String[] str2=str1.split(" ");
//            for(int j=0;j<str2.length;j++) {
//                String str3="";
//                for(int k=str2[j].length()-1;k>=0;k--) {
//                    str3+=str2[j].charAt(k);
//                }
//                System.out.println(str3);
//            }
//
//
//
//        }
    }
}
