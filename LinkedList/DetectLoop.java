public class DetectLoop {
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;

    // method to add the linked list
    public void addLast( int data){
        Node newNode = new Node (data);
        if( head== null){
            head= tail= newNode;
        }
        tail.next= newNode;
        tail= newNode;
    }

    // print the the linked lIst

    public void print(){
        Node temp= head;
        while( temp!= null){
            System.out.print( temp.data+"->");
        }
        System.out.println("null");
    }

    public static boolean isloop(){
        // find the middle element
        Node slow=head;
        Node fast= head;
        while( fast!=null && fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;
            if(fast== slow){
            return true;
            }
        }
        return false;
    }

    public static void main ( String args[]){
        head= new Node(1);
        head.next= new Node( 2);
        head.next.next= new Node(3);
        head.next.next.next= head;

        System.out.println(isloop());
    }
}
