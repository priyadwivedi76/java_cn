package hashing;
import java.util.Map;
import java.util.HashMap; 

public class frequentElement {
    public static int frequencyMap(int[] array,int key){
        Map<Integer,Integer> frequencyMap=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(!frequencyMap.containsKey(array[i])){
                frequencyMap.put(array[i],1);
            }else{
                frequencyMap.put(array[i],frequencyMap.get(array[i])+1);
            }
        }
        int maxFreq=0;int ansKey=-1;
        for(var map:frequencyMap.entrySet()){
            if(map.getValue()>maxFreq){
                maxFreq=map.getValue();
                ansKey=map.getKey();
            }
        }
        return ansKey;
    }
    public static void main(String args[]){
        int[] array={1,2,3,2,3,3};
        int key=2;
        int result=frequencyMap(array,key);
        System.out.println("The most frequent element is "+result);
    }
}
