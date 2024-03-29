package loop;
import java.util.Scanner;
public class odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=2*i-1;j<=2*num-1;j=j+2){
                System.out.print(j);
            }
             for(int k=1;k<=2*i-3;k++){
                if(k%2!=0){
                    System.out.print(k);
                }
             }
                System.out.println();
            }
        }

    }
    
