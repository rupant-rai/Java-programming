import java.util.*;

public class LHSandTS {
    public static void main( String args[]){
        LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(1);
        System.out.println(lhs);
    
        TreeSet<Integer> ts= new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(1);
        System.out.println(ts);
    }
}
