package twoDArray;

import java.util.Scanner;

public class wave {
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

   public static void wave(int arr[][]){
    int lowRow=0;
    int lowCol=0;
    int upRow=arr.length-1;
    int upCol=arr[0].length-1;


    while(lowCol!=upCol+1){
        //up to down
        for(int i=lowRow;i<=upRow;i++){
            System.out.print(arr[i][lowCol]+" ");
        }
        lowCol++;

        //down to up
        if(lowCol<=upCol){
            for(int i=upRow;i>=lowRow;i--){
                System.out.print(arr[i][lowCol]+" ");
            }
            lowCol++;
        }
        }
        
   }

   public static void main(String[] args) {
    int matrix[][]=takeInput();
    wave(matrix);
   }
}
