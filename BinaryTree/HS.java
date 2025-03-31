import java.util.*;

public class HS {

    public static void main(String args[]){
    HashSet<Integer> set= new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);
    System.out.println(set);
    if(set.contains(2)) System.out.println("conatins");
    if(set.contains(3)) System.out.println("conatins");
    set.remove(1);
    System.out.println(set.contains(1)); 
    System.out.println(set.size());
    // set.clear();
    System.out.println(set.isEmpty()); 

    // iterations using iterator

    Iterator<Integer> it= set.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }

    //iterations using advanced for loop
    for( int sets:set){
        System.out.println(sets);
    }
    }
}
