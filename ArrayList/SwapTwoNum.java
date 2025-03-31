
import java.util.*;
public class SwapTwoNum {
    public static void main( String args[]){
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(2,1,5,3,4));
        int idx1= 1, idx2= 3;
        System.out.println(list);
        swap( list, idx1, idx2);
        System.out.println(list);
    }

    public static void swap( ArrayList<Integer> list, int idx1, int idx2){
        //swap
        int temp= list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
    }
}
