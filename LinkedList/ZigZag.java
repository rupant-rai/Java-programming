public class ZigZag {
    public static class Node{
        int data;
        Node next;
        public Node ( int data ){
            this.data= data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;

    // addd in the first
    public void addFirst(int data){
        Node newNode = new Node(data); 
        if( head== null){
            head= tail= newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigzag(){
        // find middle

        Node slow= head;
        Node fast= head.next;

        while( fast!= null && fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;
        }
        Node mid= slow;

        // reverse 2nd half

        Node curr= mid.next;// spliting the list into two parts
        mid.next= null;//setting the last node of the first half to null;

        Node prev= null;
    
        Node next=null;

        while( curr!= null ){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        // head of the 2nd half wiil be the prev
        Node left= head;
        Node right= prev;
        Node nextL;
        Node nextR;
        
        // alternate merge

        while( left!= null && right!= null){
            nextL= left.next;// setting the position of nextL
            left.next= right;// pointing directly to the last node 
            nextR= right.next;// setting the position of nextR
            right.next= nextL;// pointing directly to the second node 

            left= nextL;// updating left
            right=nextR;// updating right
        }
    }

    public static void main(String args[]){
        ZigZag ll= new ZigZag();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // 5-> 4-> 3->2->1->null
        ll.print();
        ll.zigzag();
        ll.print();
    }
 
}
