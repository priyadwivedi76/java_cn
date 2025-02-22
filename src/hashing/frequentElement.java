package hashing;
import java.util.Map;
import java.util.HashMap; 

public class frequentElement {
    public static int frequency(int[] arr){
        Map<Integer,Integer> frequencyMap=new HashMap<>();
        for(int i:arr){
            if(!frequencyMap.containsKey(i)){
                frequencyMap.put(i,1);
            }else{
                frequencyMap.put(i,frequencyMap.get(i)+1);
            }
        }
        int max=0,ans=0;
        for(var e:frequencyMap.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                ans=e.getKey();
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] array={1,2,3,2,3,3};
        int result=frequency(array);
        System.out.println("The most frequent element is "+result);
    }
}
