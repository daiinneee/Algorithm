package GoormLevel;

public class GR_3차원배열 {
    public static void main(String[] args) {
        // 자료형 + 배열명 + [높이] [세로 길이] [가로 길이]
        int arr[][][] = new int [3][3][3]; // 높이 3, 세로 3, 가로3
        int num = 1;

        // 배열명.length : 페이지의 크기
        // 배열명[].length : 행의 크기
        // 배열명[][].length : 열의 크기
        System.out.println(arr.length); // 3

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                for(int k=0; k<arr[i][j].length; k++){
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
