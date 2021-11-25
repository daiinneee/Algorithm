package BackJoon.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ_3052_나머지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        //int arr[] = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();

        // ex. 처음 값 1이라고 가정
        for(int i=0; i<10; i++){
            a = sc.nextInt(); // 1
            b = (a%42);
            if(!arrayList.contains(b))
                arrayList.add(b);
            //arr[i] = b;
        }
        // contains를 사용하여 arr를 for문 돌면서 arrayList에
        // 포함되어 있지 않는 데이터만 arrayList에 add함
//        for(int k : arr){
//            if(!arrayList.contains(k))
//                arrayList.add(k);
//        }
        System.out.println(arrayList.size());
    }
}
