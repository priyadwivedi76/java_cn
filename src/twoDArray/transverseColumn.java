package twoDArray;
import java.util.Scanner;
public class transverseColumn {
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

    public static void tranverseColumn(int arr[][]) {
        //transverse column
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]=takeInput();
        tranverseColumn(arr);
    }
}
