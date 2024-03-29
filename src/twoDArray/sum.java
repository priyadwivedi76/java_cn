package twoDArray;
import java.util.Scanner;
public class sum {
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

    public static void Sum(int arr[][]) {
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int matrix[][]=takeInput();
        Sum(matrix);
    }
}
