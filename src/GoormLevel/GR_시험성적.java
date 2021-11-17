package GoormLevel;
import java.io.*;
import java.util.StringTokenizer;
import java.text.DecimalFormat;

public class GR_시험성적 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        DecimalFormat df = new DecimalFormat("##.00");

        int k = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char grade;
        double avg;
        avg = (double)(k+e+m)/3;
        System.out.println(avg); // 99.333333333

        // 세 번째 자리에서 반올림
        // -> (Math.round(반올림 하고 싶은 숫자*100)/100.0)
        double result = (Math.round(avg*100)/100.0);

        /*
        int e = 75;
        int m = 80;
        double avg = (e+m)/2 => 77.0 오답!
        -> 양쪽다 정수가 들어간 계산은, 정수까지만 계산된 77로 끝
           double 때문에 77.0으로 출력

        double avg = (e+m)/2.0 => 77.5
        double avg = (double)(e+m)/2
         */

        if(avg >= 90){
            grade = 'A';
        } else if(avg >= 80){
            grade = 'B';
        } else if(avg >= 70){
            grade = 'C';
        } else if(avg >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.print(result + " " + grade);
    }
}
