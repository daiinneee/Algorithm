package BackJoon;

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
    }
}
