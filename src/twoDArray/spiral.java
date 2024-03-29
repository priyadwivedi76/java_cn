package twoDArray;

import java.util.Scanner;

public class spiral {
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

    public static void spiral() {
        int arr[][]=takeInput();
        int row=arr.length;
        int col=arr[0].length;
        int lowRow=0;
        int upRow=row-1;
        int lowCol=0;
        int upCol=col-1;
        int count=0;
        while(row*col>count){
            //left to right
            for(int i=lowCol;i<=upCol;i++){
                System.out.print(arr[lowRow][i]+" ");
                count++;
            }
            lowRow++;

            //top to bottom
            for(int i=lowRow;i<=upRow;i++){
                System.out.print(arr[i][upCol]+" ");
                count++;
            }
            upCol--;

            //right to left
            for(int i=upCol;i>=lowCol;i--){
                System.out.print(arr[upRow][i]+" ");
                count++;
            }
            upRow--;

            //bottom to top
            for(int i=upRow;i>=lowRow;i--){
                System.out.print(arr[i][lowCol]+" ");
                count++;
            }
            lowCol++;
        }
    }

    public static void main(String[] args) {
        spiral();
    }
}
