import java.util.*;

public class LHMandTM {
    public static void main( String args[]){
        LinkedHashMap<String, Integer> lhm= new LinkedHashMap<>();
        lhm.put("I", 100);
        lhm.put("C",150);
        lhm.put("A",50);
        System.out.println(lhm);

        TreeMap<String, Integer> tm= new TreeMap<>();
        tm.put("I", 100);
        tm.put("C",150);
        tm.put("A",50);
        System.out.println(tm);

    }
}
