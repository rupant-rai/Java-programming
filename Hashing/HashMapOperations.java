import java.util.HashMap;

public class HashMapOperations {
    public static void main( String args[]){
        // creating
        HashMap<String, Integer> hm= new HashMap<>();
        // inserting -O(1)
        hm.put("India", 100);
        hm.put("us", 50);
        hm.put("China",150);

        // printing
        System.out.println(hm);

        // get 

        System.out.println(hm.get("India"));
        System.out.println(hm.get("Indonnesia"));

        // containsKey

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Chile"));

        //remove

        System.out.println(hm.remove("Chile"));
        System.out.println(hm);

        //size

        System.out.println(hm.size());

        //isEmpty()

        System.out.println(hm.isEmpty());

        //clear

        // hm.clear();
        // System.out.println(hm);

        //keySet

        // Set<String> keys= hm.keySet();
        // System.out.println(keys);
        hm.entrySet();

    }
}
