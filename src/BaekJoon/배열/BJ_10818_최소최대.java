package BaekJoon.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10818_최소최대 {
    public static void main(String[] args) throws IOException {
        // 방법1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        String input2 = br.readLine();
        StringTokenizer st = new StringTokenizer(input2);
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 최소값과 최대값을 첫번째 요소의 값으로 지정
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }

//    방법2
//    Scanner in = new Scanner(System.in);
//
//    int N = in.nextInt();
//    int[] arr = new int[N];
//
//		for (int i = 0; i < N; i++) {
//        arr[i] = in.nextInt();
//    }
//
//		in.close();
//		Arrays.sort(arr);
//		System.out.print(arr[0] + " " + arr[N - 1]);
//}

//    방법3
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    int N = Integer.parseInt(br.readLine());
//    StringTokenizer st = new StringTokenizer(br.readLine()," ");
//
//    int index = 0;
//    int[] arr = new int[N];
//		while(st.hasMoreTokens()) {
//        arr[index] = Integer.parseInt(st.nextToken());
//        index++;
//    }
//
//		Arrays.sort(arr);
//		System.out.print(arr[0] + " " + arr[N - 1]);
//}
}
