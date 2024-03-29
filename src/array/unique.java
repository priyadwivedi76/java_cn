package array;
import java.util.Scanner;

public class unique {
    public static int[] inputArray() {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int array[]=new int[m];
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        return array;
    }

    public static int unique(int[] array){
        // int array[]=inputArray();
        for(int i=0;i<array.length;i++){
            int j;
            for(j=0;j<array.length;j++){
                if(i!=j){
                    if(array[i]==array[j]){
                     break;
                    }
                }
            }
            if(j==array.length){
                return array[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int array[]=inputArray();
    int unique=unique(array);
    System.out.print(unique);
   } 
}
