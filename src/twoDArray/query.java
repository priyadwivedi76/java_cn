package twoDArray;
import java.util.Scanner;
public class query {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension of matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("The dimension of matrix are:"+m+" "+n);
        int[][] matrix=new int[m][n];
        System.out.println("Enter the number of query you want to enter:");
        int query=sc.nextInt();
        while(query-- >0){
            System.out.println("Enter the type of Query");
            int queryType=sc.nextInt();
            System.out.println("Enter R/C");
            char type=sc.next().charAt(0);
            System.out.println("Enter the index of matrix");
            int index=sc.nextInt();

            if(queryType==1){
                if(type=='R'){
                    RowFlip(matrix, index);
                }else{
                    ColFlip(matrix, index);
                }
                print(matrix);
            }
            else if(queryType==2){
                int zeroes=0;
                if(type=='R'){
                    zeroes=RowZeroesCount(matrix, index);
                }
                else{
                    zeroes=ColZeroesCount(matrix, index);
                }
                System.out.print("The number of zeroes is:"+zeroes);
            }
        }
    }

    public static int[][] RowFlip(int matrix[][],int index) {
        for(int i=0;i<matrix[index].length;i++){
            matrix[index][i]^=1;
        }
        return matrix;
    }


    public static int[][] ColFlip(int matrix[][],int index) {
        for(int i=0;i<matrix.length;i++){
            matrix[i][index]^=1;
        }
        return matrix;
    }

    public static int RowZeroesCount(int matrix[][],int index){
        int count=0;
        for(int i=0;i<matrix[index].length;i++){
            if(matrix[index][i]==0){
                count++;
            }
        }
        return count;
    }

    public static int ColZeroesCount(int matrix[][],int index){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][index]==0){
                count++;
            }
        }
        return count;
    }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
