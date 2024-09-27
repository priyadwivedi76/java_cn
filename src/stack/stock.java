package stack;
import java.util.Stack;

public class stock {
    public static int[] stockSpan(int[] price){
        Stack<Integer> stack=new Stack<>();
        int size=price.length;
        int[] output=new int[size];
        stack.push(0);
        output[0]=1;
        for(int i=1;i<size;++i){
            if(!stack.isEmpty() && price[stack.peek()]<price[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                output[i]=i+1;
            }else{
                output[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] prices={60,70,80,100,90,75,80,120};
        int[] result=stockSpan(prices);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
