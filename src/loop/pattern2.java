package loop;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=num;j>=1;j--){
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    
    
}
