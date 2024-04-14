package src.recursion;

public class sum {
    static int sum(int n){
        int sum=0;
        if(n<=0){
            return 0;
        }else{
            sum=n+sum(n-1);
            return sum;
        }
    }
    public static void main(String[] args) {
        System.out.println("The sum of 10 natural numbers is:"+sum(12));
    }
}
