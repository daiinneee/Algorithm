package BackJoon.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ_3052_나머지 {
    public static void main(String[] args) {
        // 방법1
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<10; i++){
            a = sc.nextInt(); // 1
            b = (a%42);
            // contains를 사용하여 arrayList에
            // 포함되어 있지 않는 데이터만 arrayList에 add함
            if(!arrayList.contains(b))
                arrayList.add(b);
        }
        System.out.println(arrayList.size());
    }

//    방법2
//    Scanner sc = new Scanner(System.in);
//    int[] n = new int[10];
//    int count = 0;
//
//
//   for(int i=0;i<10;i++) {   //10개수를 입력받고 42로 나눈다.
//        n[i] = sc.nextInt()%42;
//
//    }
//
//
//   for(int i=0;i<10;i++) {      //10개중 중복값이 있는지 검증하는 부분
//        int cnt = 0;
//        for(int j=i+1 ;j<10 ;j++) {
//            if(n[i]==n[j]) {     //순차로 진행된 j 부터 같은값을 찾는다.
//                cnt++;
//            }
//        }
//        if(cnt==0) {   //같은값이 없을때만 숫자를 더해준다.
//            count++;
//        }
//    }
//   System.out.println(count);  //숫자출력
//}

//    방법3 - HashSet 사용
//    HashSet : 중복되는 원소를 넣을 경우 하나만 저장 즉, 중복 원소 허용하지 않음!
//              순서 개념이 없음(정렬X) 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야 함
//
//    Scanner in = new Scanner(System.in);
//    HashSet<Integer> h = new HashSet<Integer>();
//
//		for (int i = 0; i < 10; i++) {
//        h.add(in.nextInt() % 42);
//        //입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
//    }
//
//		in.close();
//		System.out.print(h.size());
//}
}
