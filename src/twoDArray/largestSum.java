package twoDArray;

import java.util.Scanner;

public class largestSum {
    public static int[][] takeInput() {

        //function for input of two dimensional Array
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

    public static void largestSum(int arr[][]) {
        int max1=0;
        int max1_indices=0;
        int row_sum=0;
        int col_sum=0;
        int i,j;
        for(i=0;i<arr.length;i++){
            row_sum=0;
            for(j=0;j<arr[0].length;j++){
                row_sum+=arr[i][j];
                if(max1<row_sum){
                    max1=row_sum;
                    max1_indices=i;
                }
            }
        }
        int max2=0;
        int max2_indices=0;
        int k,l;
        for(k=0;k<arr[0].length;k++){
            col_sum=0;
            for(l=0;l<arr.length;l++){
                col_sum+=arr[l][k];
                if(max2<col_sum){
                    max2=col_sum;
                    max2_indices=k;
                }
            }
        }

        if(max1>max2){
            System.out.println("The largest sum is: "+max1+" at row: "+max1_indices);
        }else{
            System.out.println("The largest sum is:"+max2+" at column: "+max2_indices);
        }
    }

    public static void main(String[] args) {
        int arr[][]=takeInput();
        largestSum(arr);
    }
}
