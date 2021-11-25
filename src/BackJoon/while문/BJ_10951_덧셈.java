package BackJoon.while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
    주의할 점
    입력의 종료는 더이상 읽을 수 있는 데이터(EOF)가 없을 때 종료!

    EOF란?
    파일의 끝. 즉 더 이상 읽을 데이터가 없는 것을 나타내는 단어
 */
public class BJ_10951_덧셈 {
    public static void main(String[] args) throws IOException {
        // 방법1 : BufferedReader 클래스로 EOF 처리하는 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringTokenizer st;
        int a;
        int b;
        // List는 인터페이스, arrayList는 List에 상속된 클래스
        List<Integer> array = new ArrayList<>();

        // input 변수에 readLine()으로 저장
        // EOF라면 null값이 저장되어 반복문을 빠져나옴
        /*
           먼저 input에 br.readLine()을 통해 한 줄의 입력된 문자열을 input에 저장하고,
           그렇게 저장된 문자열을 담고 있는 input이 null인지(더이상 읽을 데이터가 없는 상태)인지를
           검사하고, 만약 null이 아니라면 input은 문자열을 갖고있기 때문에
           StringTokenizer에 파라미터를 주며 생성
           input=br.readLine()을 담음과 동시에 조건을 검사하는 것!
        */
        while((input=br.readLine()) != null){
            //input = br.readLine();
            st = new StringTokenizer(input);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            array.add(a+b);
        }
        for(int i=0; i<array.size(); i++){
            System.out.println(array.get(i));
        }
    }

//    방법2 : Scanner 클래스로 EOF 처리하는 방법
//    Scanner in=new Scanner(System.in);
//
//    // 입력 데이터를 숫자로 받으면 EOF를 체크
//    // EOF면 false로 반복문을 빠져나옴
//	  while(in.hasNextInt()){
//
//        int a=in.nextInt();
//        int b=in.nextInt();
//        System.out.println(a+b);
//
//    }
//		in.close();
//}
}
