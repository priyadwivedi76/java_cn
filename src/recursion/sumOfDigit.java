package src.recursion;

public class sumOfDigit {
    public static int sum(int number){
        int sum=0;
        if(number<10){
            sum=number;
            return sum;
        }
        sum=sum+number%10;
        int res=sum(number/10);
        return res+sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(32000));
    }
}
