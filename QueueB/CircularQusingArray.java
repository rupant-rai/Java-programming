public class CircularQusingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue( int n){
            arr= new int[n];
            size= n;
            front=-1;
            rear= -1;
        }

        // empty

        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        // full

        public boolean full(){
            return (rear+1)%size==front;
        }

        // addd

        public void add( int data){
            if(full()){
                System.out.println(" queue is full");
                return;
            }
            if( front== -1){
                front= 0;
            }
            rear= (rear+1) % size;
            arr[rear]= data;
        }

        // remove

        public int remove(){
            if(isEmpty()){
                System.out.println(" queue is empty");
                return -1;
            }
            int result= arr[front];
            if( rear== front){// if it is last element
                rear= front= -1;
            }
            else{
                front= (front+1)% size;
            }
            return result;
        }

        // peek

        public int peek(){
            if(isEmpty()){
                System.out.println(" queue is empty");
                return -1;
            }
            return arr[front];
        }

        public static void main( String args[]){
            Queue q= new Queue(3);
            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.remove());
            
            q.add(4);
            System.out.println(q.remove());
            
            q.add(5);
            System.out.println("size"+ size);
            while( !q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
