package recursion;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of:");
        int num=sc.nextInt();
        int res=fact(num);
        System.out.println("The factorial of the "+num+" is:"+res); 
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int smallFact=n*fact(n-1);
        return smallFact;
    }
    
}

