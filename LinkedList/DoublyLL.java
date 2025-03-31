public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node ( int data){
            this.data= data;
            this.next=null;
            this.prev= null;
        } 
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // mehtods 

    // addFirst in the doubly ll

    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if ( head== null){
            head= tail= newNode;
            return;
        }
        newNode.next= head;
        head.prev= newNode;
        head= newNode;
    }

    // method to add in the last of doubly ll

    public void addLast( int data){
        Node newNode= new Node(data);
        size++;
        if( head== null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        newNode.prev= tail;
        tail= newNode;
    }

    // method to print the dooubly Ll

    public void print( ){
        Node temp=head;
        while( temp!= null){
            System.out.print(temp.data+ "<->");
            temp= temp.next;
        }
        System.out.println("null");
    }


    // method to remove form the first in the doubly linked ll

    public int removeFirst(){
        if(head== null){
            System.out.println(" ll is empty");
            return Integer.MIN_VALUE;
        }
        else if( size== 1){
            int val= head.data;
            head= tail= null;
            size--;
            return val;
        }
        int val= head.data;
        head= head.next;
        head.prev= null;
        size--;
        return val;
    }

    public int removeLast(){
        if( head== null){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if( size==1){
            int val= head.data;
            head= tail= null;
            size--;
            return val;
        }
        int val= tail.data;
        tail= tail.prev;
        tail.next= null;
        size--;
        return val;
    }

    public static void main( String args[]){
        DoublyLL dll= new DoublyLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);

        dll.print();
        System.out.println(size);

        dll.removeFirst();
        dll.print();
        System.out.println(size);

        dll.removeLast();
        dll.print();
        System.out.println(size);
    }
}