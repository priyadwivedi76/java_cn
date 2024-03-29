package loop;
import java.util.Scanner;
public class sumProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int choice=sc.nextInt();
        if(choice==1){
            int sum=0;
            for(int i=1;i<=num;i++){
                sum=sum+i;
            }
            System.out.print(sum);
        }else if(choice==2){
            int product=1;
            for(int i=1;i<=num;i++){
                product=product*i;
            }
            System.out.print(product);
        }else{
          System.out.print(-1);  
        }
        
    }
    
}
