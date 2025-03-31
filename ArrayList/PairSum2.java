import java.util.*;

//  pair sum == target in sorted and roated ArrayList

// by using two pointer approach
public class PairSum2 {
    public static void main( String args[]){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,8,3,4,5));
        System.out.println(PairSum(list, 10));
    } 
    public static Boolean PairSum( ArrayList<Integer> list, int target ){
        // finding piviot point or breaking point
        int bp= -1;// lets take it is an invalid index
        for ( int i=0; i<list.size(); i++){
            // using the concept of sorted arraylist: (i)th element < (i+1)th element;
            // but in this case we have to find the exception
             //i.e., we have to find that from which index the array is not following the rule of sorted arrayList
            if( list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }

        // 2 pointer 
        int n= list.size();

        int lp=(bp+1)%n;// before rotation it was the starting point // in sorted al first element is the smallest point
        int rp= bp;// before rotation it was the ending point // in sorted al ending point is the largets element
        
        while( lp!= rp){
            // Case 1
            if( list.get(lp)+ list.get(rp)== target){
                return true;
            }
            // Case 2

            else if ( list.get(lp)+ list.get(rp)< target ){
                lp=(lp+1)%n;
            }

            // Case 3:  if Sum> target 
            else{
                rp= (rp+n-1)%n;
            }
        }
        return false;

    }
}
