public class RemoveLoop {
    public static class Node{
        int data;
        Node next;
        public Node( int data){
            this.data= data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean remLoop(){
        Boolean cycle= false;
        Node slow= head;
        Node fast= head;
        while( fast!= null && fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;
            if( slow== fast){
                cycle= true;
                break;
            }
        }
        
        if( cycle== true){
            // we have to break the loop
            slow= head;
            Node prev= null;
            while( slow!= fast){
                prev= fast;
                slow= slow.next;
                fast= fast.next;
            }
            // remove the cycle by pointing to the null

            prev.next= null;
        }
        return cycle;
    }

    public static void main( String args[]){
        head= new Node(1);
        Node temp= new Node (2);
        head.next= temp;
        head.next.next= new Node( 3);
        head.next.next.next= temp;

        System.out.println(remLoop());
        remLoop();
        System.out.println(remLoop());
    }

}
