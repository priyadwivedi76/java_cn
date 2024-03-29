package twoDArray;
import java.util.Scanner;
public class largestColSum {
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


    public static int largestColumnSum(int arr[][]){
        int largestSumCol=Integer.MIN_VALUE;
        for(int k=0;k<arr[0].length;k++){
            int sum=0;
            for(int l=0;l<arr.length;l++){
                sum+=arr[l][k];
                if(sum>largestSumCol){
                    largestSumCol=sum;
                }
            }
        }
        return largestSumCol;
    }
    public static void main(String[] args) {
        int arr[][]=takeInput();
        System.out.println(largestColumnSum(arr));
    }
}
