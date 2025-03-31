//package LinkedList;

public class ReverseLL {
    public static class Node
    {
        int data;
        Node next;

        public  Node(int data ){
            this.data= data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;

    //metgod to add in the last

    public void addLast( int data){
        Node newNode = new Node( data);
        if( head== null){
            head= tail= newNode;
        }

        tail.next= newNode;
        tail= newNode;
    }

    // method to reverse the Linked list

    public void rev(){
        Node prev= null;
        Node curr= tail= head;
        Node next;

        while( curr!=null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        head= prev;// as when the loop end ,the current element will be equal to null 
    }

    // method to print the linkedList

    public void print(){
        Node temp= head;
        // using loop to iterate to the each node
        while( temp!= null){
            System.out.print( temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public static void main( String args[]){
        ReverseLL ll= new ReverseLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast( 3);
        ll.addLast( 4);

        ll.print();
        ll.rev();
        ll.print();
    }

}
