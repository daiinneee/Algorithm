package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5622_다이얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ex. UNUCIC
        String input = br.readLine();

        int time = 0;
        for(int i=0; i<input.length(); i++){
            switch (input.charAt(i)){
                case 'A' : case 'B' : case 'C' :
                    time = time + 3;
                    break;
                case 'D' : case 'E' : case 'F' :
                    time = time + 4;
                    break;
                case 'G' : case 'H' : case 'I' :
                    time = time + 5;
                    break;
                case 'J' : case 'K' : case 'L' :
                    time = time + 6;
                    break;
                case 'M' : case 'N' : case 'O' :
                    time = time + 7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S' :
                    time = time + 8;
                    break;
                case 'T' : case 'U' : case 'V' :
                    time = time + 9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    time = time + 10;
                    break;
            }
        }
        System.out.println(time);
    }
}
