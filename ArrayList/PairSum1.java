import java.util.*;

public class PairSum1{
    public static void main( String args[]){
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(pairSum(list,5));
        System.out.println(pairsum(list, 5));
    }

    // Brute Force approach
    public static boolean pairsum( ArrayList<Integer> list, int target){
        for ( int i=0; i<list.size(); i++){
            for ( int j=i+1; j< list.size(); j++){
                if( list.get(i)+ list.get(j)== target){
                    return true;
                }
            }
        }
        return false;
    }




    //by two pointer approach

    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp=0;
        int rp= list.size()-1;
        while( lp<rp){
            // Case 1
            if( list.get(lp)+ list.get(rp)== target){
                return true;
            }

            // Case 2 sum< target
            else if( list.get(lp)+ list.get(rp) <target){
                lp++;
            }

            //Case 3 ;sum>tar ;if( list.get(lp)+ list.get(rp))> target)
            else
            {
                rp--;
            }

        }
        return false;
    }
}