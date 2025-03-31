import java.util.*;

public class Sorting {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(2,5,9,3,6));
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted in ascending order = "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorting in descending order = "+list);
    } 
}
