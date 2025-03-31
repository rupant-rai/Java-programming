public class CircluarLL {
    public static  class Node{
        int data;
        Node next;
        public Node( int data){
            this.data= data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;

    // method to add element in the starting of a circular linked lISt
    public void addFirst( int data){
       Node newNode = new Node(data);
       if( head== null) {
         head= tail= newNode;
         tail.next= head;
         return ;
       }
       newNode.next= head;
       head= newNode;
       tail.next= newNode;
    }

    // method the add elemnt in the end od the circular ll

    public void addLast(int data){
        Node newNode = new Node( data);
        if( head== null){
             head= tail= newNode;
             tail.next= head;
             return ;
        }
        tail.next= newNode;
        tail= newNode;
        tail.next= head;
    }

    // method to remove elemnet fromt the last

    public void removeLast(){
        if( head== null){
            System.out.println(" empty ll");
            return;
        }
        else if(head== tail){
            head= tail= null;
            return;
        }
        Node temp= head;
        while( temp!= tail){
            temp= temp.next;
        }
        temp.next= head;// as after the loop  temp will be at one positton before tail
        tail= temp;
    }

    // method to remove elememnt from the start

    public void removeFirst( ){
        if( head== null){
            System.out.println(" empty linked list");
            return;
        }
        else if( head== tail){
            head= tail= null;
            return ;
        }
        head= head.next;
        tail.next= head;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head); // Stop when we reach the head again
        System.out.println("(head)");
    }

    public static void main( String args[]){
        CircluarLL cl= new CircluarLL();
        cl.addLast(1);
        cl.addLast(2);
        cl.addLast(3);
        cl.print();
    }
}
