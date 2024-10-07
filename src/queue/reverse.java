import java.util.Queue;
import java.util.LinkedList;;
public class reverse {
    public static void ReverseQueue(Queue<Integer> Input){
        if(Input.size()<=1){
            return;
        }
        int temp = Input.poll();
        ReverseQueue(Input);
        Input.add(temp);
        return;
    }

    public static void main(String[] args) {
        Queue<Integer> Input=new LinkedList<>();
        int[] array={10,20,30,40,50};
        for(int num:array){
            Input.add(num);
        }
        ReverseQueue(Input);

        while(!Input.isEmpty()){
            System.out.print(Input.poll()+" ");
        }
    }
}
