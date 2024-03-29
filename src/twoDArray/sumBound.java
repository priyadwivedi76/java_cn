package twoDArray;

import java.util.Scanner;

public class sumBound {
    public static int[][] takeInput() {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    public static int sum(int arr[][]) {
        int sum=0;
        int lowCol=0;
        int lowRow=0;
        int upRow=arr.length;
        int upCol=arr[0].length;
        if(arr.length!=arr[0].length){
            return 0;
        }else{
            for(int i=lowRow;i<upRow;i++){
                for(int j=lowCol;j<upCol;j++){
                    if(i==lowRow||i==upRow||j==lowCol||j==upCol||i==j||i+j==arr.length){
                        sum+=arr[i][j];
                    }
                } 
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]=takeInput();
        System.out.print(sum(arr));
    }

}
