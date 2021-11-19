package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GR_뱀이지나간자리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ex. 3 3
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        // 세로 길이
        int a = Integer.parseInt(st.nextToken());
        // 가로 길이
        int b = Integer.parseInt(st.nextToken());
        boolean line = true;
        boolean left = false;

        for(int i=0; i<a; i++){
            if(line){
                for(int j=0; j<b; j++){
                    System.out.print("#");
                }
                System.out.println();
                line = false;
            } else {
                if(left){
                    System.out.print("#");
                }
                for(int j=0; j<b-1; j++){
                    System.out.print(".");
                }
                if(!left) {
                    System.out.print("#");
                }
                System.out.println();
                left = !left;
                line = true;
            }
        }

//        // 세로 길이 만큼 반복
//        for(int i=1; i<=a; i++){
//            for(int j=1; j<=b; j++){
//                System.out.print("#");
//                if(j==b){
//                    System.out.println();
//                    for(int k=1; k<=2; k++){
//                        if(k==1){
//                            System.out.print(".");
//                        } else {
//
//                        }
//                    }
//                }
//            }
//        }
//
//        // 1 2 3
//        for(int i=1; i<=b; i++){
//            System.out.print("#");
//            if(i==b){
//                System.out.println();
//                for(int j=1; j<=b; j++){
//                    if(j<b){
//                        System.out.print(".");
//                    } else {
//                        System.out.print("#");
//                        System.out.println();
//                    }
//                }
//            }
//        }
    }
}
