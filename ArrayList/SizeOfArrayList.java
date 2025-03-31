
import java.util.*;

public class SizeOfArrayList{
    public static void main( String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        for ( int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // to reverse the arrayList

        for ( int j=list.size()-1; j>=0; j--){
            System.out.print(list.get(j)+" ");
        }
    }
}