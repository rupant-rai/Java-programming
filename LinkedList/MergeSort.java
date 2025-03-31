public class MergeSort {
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

    public  Node merSort(Node head){
        if( head== null || head.next== null){
            return head;
        }

        // find the miod element
        Node mid= findMid(head);

        // split into 2 parts

        Node righthead= mid.next;//breaking into two pieces// last node of the 2nd half is already null 
        mid.next= null;// seting last node of first half to null

        // calling merge sort for the both parts
        Node newleft= merSort(head);
        Node newRight= merSort(righthead);

        // merge the two parts
        return merge( newleft, newRight);
    }

    private Node findMid(Node head){// throgh slow fast approach in which the middle of the element is last node of the first half
        Node slow= head;
        Node fast= head.next;
        while( fast!=null && fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    private Node merge( Node headL, Node headR){
        Node mergell= new Node(-1);
        Node temp= mergell;
        while( headL!=null && headR!= null){
            // compare among both the half and add the smallest node in the mergell 
            if( headL.data<= headR.data){
                temp.next= headL;
                headL= headL.next;
                temp= temp.next;
            }
            else{
                temp.next= headR;
                headR= headR.next;
                temp= temp.next;
            }
        }

        // for the left over elements as when one of the condition in the prev while loop is not satisfied then 
        // loop breaks and the other part is left over . but we dont know that which part will be left over .
        // so we will cover those two left over parts in the othe rtwo while looops

        while( headL!= null){
            temp.next= headL;
            headL= headL.next;
            temp= temp.next;
        }
        while( headR!= null){
            temp.next= headR;
            headR= headR.next;
            temp= temp.next;
        }
        return mergell.next;
    }

    public static void main( String args[]){

        MergeSort ll= new MergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // 5-> 4-> 3->2->1->null
        ll.print();
        
        MergeSort.head= ll.merSort(MergeSort.head);
        ll.print();
    }
}
