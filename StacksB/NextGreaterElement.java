import java.util.*;

public class NextGreaterElement {
    public static void main( String args[]){
        int arr[]= { 6, 8,0, 1, 3};
        Stack<Integer> s= new Stack<>();
        int nextgrt[]= new int[arr.length];

        for ( int i= arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]< arr[i]){
                s.pop();
            }
            if( s.isEmpty()){
                nextgrt[i]= -1;
            }
            else{
                nextgrt[i]= s.peek();
            }
            s.push(i);
        }

        for( int i=0; i< nextgrt.length; i++){
            System.out.print(nextgrt[i]+" ");
        }
        System.out.println();
    }    
}

// for next greater right chnge the loop i.e., start from i=0 and move till arr.length
// for next smaller right only change the condition inside the while loop( >=) i.e., we have to pop out all till the greter element is found in the stack
// for next smaller right change the i.e., start from i=0; and also change the condition inside the while loop {>=}
