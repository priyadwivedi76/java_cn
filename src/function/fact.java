package function;
import java.util.Scanner;
public class fact {

    public static int factorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int num1=factorial(n);
        int den1=factorial(r);
        int den2=factorial(n-r);
        int result=num1/(den1*den2);
        System.out.print(result);
    }
    
}
