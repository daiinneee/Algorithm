package Programmers;

public class PG_정수제곱근판별 {
    public static void main(String[] args) {
        int n = 36;
        Double sqrt = Math.sqrt(n);

        if(sqrt == sqrt.intValue()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
