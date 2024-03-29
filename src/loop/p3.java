package loop;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        while(count<=n){
            int num=sc.nextInt();
            count++;
            for(int i=1;i<=num;i++){
               
                    for(int space=1;space<=i-1;space++){
                        System.out.print(" ");
                    }
                    for(int k=1;k<=num-i+1;k++){
                        System.out.print("*");
                    }
                System.out.println();
            }
        }
    }
}
