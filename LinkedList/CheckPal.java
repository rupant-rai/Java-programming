//package LinkedList;

public class CheckPal {
    public static class Node{ 
        int data;
        Node next;

        public Node ( int data){
            this.data = data;
            this.next= null;
        }
    } 
    public static Node head;
    public static Node tail;

    // method to add element in the ll

    public void addFirst(int data){
        Node newNode = new Node( data);
        if(head== null){
            head= tail= newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    }

    //meth0od to print the ll

    public void print(){
        Node temp = head;
        while ( temp!= null){
            System.out.print(temp.data+"->");;
            temp= temp.next;
        }
        System.out.println("null");
    }

    // method to find the middle node in the ll by using slow fast method

    public Node findMid( Node head){
        Node slow= head;
        Node fast= head;

        while( fast!=null && fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;// as when the fast node reaches to the null or before null till then the slow reaches mid
    }


    // method to check wether the ll is palindrome or not 
    public boolean checkPal(){
        // Base case
        if( head== null || head.next== null){
            return true;
        }
        Node midNode= findMid(head);

        // we need to reverse the 2nd half of the ll

        Node prev= null;
        Node curr= midNode;
        Node next= null;

        while( curr!= null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        Node right= prev;// as when curr will be equal to null then the prev wiil the the head of the reversed node
        Node left= head;

        // check if the left node = right

        while( right!=null){
            if( left.data!= right.data){
                return false;
            }
            left= left.next;
            right= right.next;
        }
        return true;
    }

    public static void main( String args[]){
        CheckPal ll= new CheckPal();
        ll.print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        System.out.println(ll.checkPal());


    }
}
