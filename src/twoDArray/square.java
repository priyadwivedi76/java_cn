package twoDArray;

import java.util.Scanner;

public class square {
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
    //check if matrix is square matrix
    public static boolean Square(int arr[][]) {
        int m=arr.length;
        int n=arr[0].length;
        boolean Square=false;
        if(m==n){
            Square=true;
        }
        return Square;
    }

    public static void printDiagonal(int arr[][]) {
        boolean res=Square(arr);
        if(res==true){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(i==j){
                        System.out.print(arr[i][j]+" ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[][]=takeInput();
        boolean result=Square(array);
        if(result==true){
            System.out.print("Yes"+" ");
        }else{
            System.out.print("No");
        }
        printDiagonal(array);
    }
}
