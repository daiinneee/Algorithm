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
        int tot;
        char grade;
        tot = k+e+m;
        double avg;
        avg = tot/3.0F;

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

        System.out.print(df.format(avg) + " " + grade);
    }
}
