package loop;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class isosclesTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int f=1;f<=i;f++){
                System.out.print(f);
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
