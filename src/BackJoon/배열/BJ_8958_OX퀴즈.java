package BackJoon.배열;

import java.util.Scanner;

public class BJ_8958_OX퀴즈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        int result[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.next();
        }
        // 첫번째 배열에 OOXXOXXOOO
        for(int i=0; i<arr.length; i++){
            int count = 0;
            int sum = 0;
            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    count++;
                } else {
                    count = 0;
                }
                sum = sum + count;
            }
            result[i] = sum;
        }
        for(int k : result){
            System.out.println(k);
        }
    }
}
