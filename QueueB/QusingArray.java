public class QusingArray{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue( int n){
            arr= new int[n];
            size= n;
            rear= -1;
        }

        // operations
        // empty

        public boolean isEmpty(){
            return rear== -1;
        }

        // add function

        public void add( int data){
            if(rear== size-1){
                System.out.println("queue is full");
                return;
            }
            rear= rear+1;
            arr[rear]= data;
        }

        // remove function

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front= arr[0];
            for (int i=0; i<rear; i++){// using loop here to shift right one element so that front element can be deletd
                arr[i]= arr[i+1];
            }
            rear= rear-1;
            return front;
        }

        // peek function

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

        public static void main( String args[]){
            Queue q= new Queue(3);//here queue is the class not the queue of jcf.
            q.add(1);
            q.add(2);
            q.add(3);
            while( !q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}