package loop;
import java.util.Scanner;
public class ap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=1;
        int count=0;
        while(count<num){
            int term=3*a+2;
            a++;
            if(term%4!=0){
                System.out.print(term+" ");
                count++;
            }
        }
    }
    
}
