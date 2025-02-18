import java.util.HashMap;
import java.util.Map;
public class init {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        //Insertion in hash map
        map.put("Yash",21);
        map.put("Aman",22);
        map.put("Radhika",21);
        map.put("Priya",25);

        //Updation in already existing key
        System.out.println("The age of Yash before updation:"+map.get("Yash"));
        map.put("Yash",25);
        System.out.println("The age of Yash after updation:"+map.get("Yash"));

        //Deletion of particular key
        map.remove("Yash");

        //Printing deleted key
        System.out.println("Value of key Yash:"+map.get("Yash"));

        //Deleting Something that doesnt even exist
        map.remove("Sachin");

        //Checking whether particular key exists or not 
        System.out.println("Key Present:"+map.containsKey("Priya"));

        //Add if key-value does not exist
        if(!map.containsKey("Yash")) map.put("Yash",23);

        //Alternative for previous one
        map.putIfAbsent("Sachin",24);
        System.out.println("The value of the key Sachin is:"+map.get("Sachin"));

        //Getting the keys that  are inserted or the number of the key that are present
        System.out.println("The key present in the map are:"+map.keySet());

        //Getting all the values
        System.out.println("The value of keys:"+map.values());

        //key-value pair
        System.out.println("The key-value pair:"+map.entrySet());
    }
}
