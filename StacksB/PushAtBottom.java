import java.util.*;

public class PushAtBottom {
    public static void main(String args[]){
        Stack < Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // function to push at the bottom 

        pushAtBottom( s, 4);
        while( !s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void pushAtBottom( Stack<Integer> s, int data){
        if( s.isEmpty()){
            s.push( data);
            return;
        }

        int top= s.pop();// pop the elements in the impicit function to insert in the bottom of the stack
        pushAtBottom(s, data);//continue poping till all the elements are poperd out using tghis recursive function 
        s.push(top);// now after inserting at te bottom its time to push all the elements in sam eorder in the explicit stacke
    }
}
