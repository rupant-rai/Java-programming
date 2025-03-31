
public class CreateLinkedList {
    public static class Node{// here the Node is class
        // initilizing data and next of a node
        int data;
        Node next;

        // create a constructor
        public Node( int data){
            this.data= data;
            this.next= null;
        }

    } 

    public static Node head;
    public static Node tail;
    public int size;

    //various methods to perform different operations in the linked List

    // add in the first of the linkedList

    public void addFirst( int data){
        Node newNode= new Node(data);
        size++;
        // base case
        if( head== null){
            head=tail= newNode;
            return;
        }

        newNode.next= head;
        head= newNode;
    }

    //method to add in the last of the Linked List

    public void addLast( int data){
        Node newNode= new Node(data);
        size++;
        if( head== null){
            head= tail= newNode;
        }

        tail.next= newNode;
        tail= newNode;
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

    // method to add new node in the middle of the LinkedList

    public void add(int idx, int data){// here idx is the index where we want to add the new node in the middle
        // data is the data we want to store in the new Node
        if( idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        // creating a temperoray Node 
        Node temp= head;
        int i=0;
        while( i< idx-1){
            temp=temp.next;
            i++;
        }

        // when the loop ends i.e. prev element to target element
        newNode.next= temp.next;
        temp.next= newNode ;

    }

    // removing a node in the first

    public int removeFirst(){
        // special case
        if( size==0){
            System.out.println(" LinkedList empty");
            return Integer.MIN_VALUE;
        }
        else if( size== 1){
            int val= head.data;
            head= tail= null;
            size=0;
            return val;
        }

        // maain kaam
        int val= head.data;
        head= head.next;
        size--;
        return val;
    }

    // method to remove element from the last of the Linked list

    public int removeLast(){
        // special case

        if( size==0){
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if( size==1){
            int val= tail.data;
            head= tail= null;
            size=0;
            return val;
        }

        // main kam

        Node prev= head;

        // find the prev element which would be at size-2 position

        for( int i=0; i< size-2; i++){
            prev= prev.next;
        }
        int val= prev.next.data;
        prev.next= null;
        tail= prev;
        size--;
        return val;
    }

    // method to search in the linked List iterratively

    public int iteSer(int key){
        Node temp=head;
        int i=0;
        while( temp!=null){
            if( temp.data== key){
                return i;
            }
            temp= temp.next;
            i++;
        }
        return -1;
    }
    // helper function for the recusrsive search
    public int helper( Node head, int key){
        if( head==null){
            return -1;
        }
        else if( head.data==key){
            return 0;
        }

        int idx= helper( head.next, key);
            if( idx== -1){
                 return -1;
            }
            else{
                return idx+1;// as at each recursive call the prev node had called the function and at heach call head was prev
            }
        }
    
    // method for recursively searching in the Linked list
    public int recSer( int key){
         return helper( head, key);
    }

    //method to find and remove nth term from the last

    public void delete( int n){
        // claculate  the size of the Linkedlist

        int size=0;
        Node temp= head;
        while( temp!= null){
            temp = temp.next;
            size++;
        }
        
        if( n==size){// means when the we have to remove nth term from the last or 1st term from the start i.e, head
            head= head.next;
        }

         int i=1;
         Node prev= head;
         int itoFind= size-n;
        //now travel to the size-n i.e one position prev to the target node
         
         while( i< itoFind){
            prev= prev.next;
         }
         prev.next= prev.next.next;
         return;
    }



    public static void main(String args[]){
        CreateLinkedList ll = new CreateLinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.add( 2,3);
        ll.print();

        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();
        System.out.println("current size is ="+ ll.size);

        System.out.println(ll.iteSer(3));
        System.out.println( ll.recSer(3));
    } 
}
