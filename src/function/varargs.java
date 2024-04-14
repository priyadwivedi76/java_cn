package src.function;

public class varargs {
    static int sum(int ...arr){
        //int arr is array of the arguments passed by the user
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The sum of the number 4 and 5 are:"+sum(4,5));
        System.out.println("The sum of the number 2,4 and 5 are:"+sum(4,5,2));

    }
}
