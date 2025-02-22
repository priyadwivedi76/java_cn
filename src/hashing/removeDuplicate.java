package hashing;
import java.util.ArrayList;
import java.util.HashMap;;
public class removeDuplicate {
    public static ArrayList<Integer> removeDuplicate(int[] array){
        ArrayList<Integer> output=new ArrayList<>();
        HashMap<Integer,Boolean> mplist = new HashMap<Integer,Boolean>();
        for(int i=0; i<array.length; i++){
            if(mplist.containsKey(array[i])){
                continue;
            }
            mplist.put(array[i],true);
            output.add(array[i]);
        }
        return output;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,1};
        ArrayList<Integer> result=removeDuplicate(arr);
        for (int i=0; i<result.size(); i++) {
            System.out.println(result.get(i)+" ");
        }
    }
}
