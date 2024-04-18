package src.recursion;
import java.util.Scanner;
public class numOfDigit {
    public static int count(int n){
        int ans=0;
        if(n==0){
            return 0;
        }
        int small=count(n/10);
         ans=small+1;
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digit;
        digit=count(num);
        System.out.println(digit);
    }
}
