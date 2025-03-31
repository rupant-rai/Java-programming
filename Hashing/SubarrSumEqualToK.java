import java.util.*;

public class SubarrSumEqualToK {
    public static void main( String args[]){
        int arr[]= {10, 2, -2, -20, 10};
        int k=-10;
        HashMap<Integer, Integer> map= new HashMap<>();
        //<sum, count>
        map.put(0,1);// by default;
        int sum=0, ans=0;
        for ( int j=0; j< arr.length; j++ ){
            sum+= arr[j];
            if( map.containsKey(sum-k)){//map.conatinsKey(i);
                ans+= map.get(sum-k);// find the count of the string whose sum= k
            }
            else{
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
        }
        System.out.println(ans);
    }
}
