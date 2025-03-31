import java.util.*;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if( s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();// pop the top
        pushAtBottom(s, data); // pop all other elememt so that data can be inserted at the bottom
        s.push(top);// push all the elements in the smae order
    }

    public static void reverse( Stack<Integer> s){
        if( s.isEmpty()){
             return ;
        }
        int top= s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main( String args[]){
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        printStack(s);
    }
}
