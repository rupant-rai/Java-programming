import java.util.*;

public class StackUsingTwoQ {
    static class Stack{
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();

        // empty

        public boolean Empty(){
            return q1.isEmpty()&& q2.isEmpty();
        }

        // add

        public void push( int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{// (!q2.isEmpty())
                q2.add(data);
            }
        }

        // pop operation

        public int pop(){
            if(Empty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }

            else{
                while(!q2.isEmpty()){
                    top= q2.remove();
                    if( q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        //peek

        public int peek(){
            if(Empty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top=-1;
            //case 1
            if( !q1.isEmpty()){
                while(!q1.isEmpty()){
                    top= q1.remove();
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top= q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }

        public static void main (String args[]){
            Stack s= new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            while( !s.Empty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
    }
}
