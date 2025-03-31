import java.util.*;

public class ImplementByAL{
    static class Stack{
        static ArrayList<Integer> list= new ArrayList<>();
        // checking if stack is empty or not

        public boolean isEmpty(){
        return list.size()==0;
        }

        // push o[peration

        public void push( int data){
        list.add( data);
        }

        // pop operation
        public int pop(){
            if( isEmpty()){
                return -1;
            }
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek operation 
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get( list.size()-1);
        }
    }

    // main function

    public static void main(String args[]){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while( !s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}