import java.util.*;

public class MaxAreaInHistogram {
    public static int MAX(int arr[]){
        int maxArea=0;
        int nsr[]= new int[arr.length];
        int nsl[]= new int[arr.length];

        // next smallest right
        Stack<Integer> s= new Stack<>();
        for( int i=arr.length-1; i>=0; i--){
            while( !s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]= arr.length;
            }
            else{
                nsr[i]= s.peek();
            }
            s.push(i);
        }

        // next smallest left

        Stack<Integer> a= new Stack<>();
        for ( int i=0; i<arr.length; i++){
            while( !a.isEmpty() && arr[a.peek()]>= arr[i]){
                a.pop();
            }
            if( a.isEmpty()){
                nsl[i]= -1;
            }
            else{
                nsl[i]= a.peek();
            }
            a.push(i);
        }

        // area
        for ( int i=0; i< arr.length; i++){
            int h= arr[i];
            int w= nsr[i]- nsl[i]-1;
            int currArea= h*w;
            maxArea= Math.max( currArea, maxArea);
        }
        return maxArea;
    }

    public static void main( String args[]){
        int arr[]= { 2,1, 5, 6, 2, 3};
        System.out.println(MAX(arr));
    }
}
