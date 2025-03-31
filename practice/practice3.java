
public class practice3 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node( int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
    
    static class BT{
        static int idx= -1;
        public Node Buildtree(int nodes[]){
            idx++;
            if(nodes[idx]== -1) return null;
            Node newNode= new Node(nodes[idx]);
            newNode.left= Buildtree(nodes);
            newNode.right= Buildtree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree= new BT();
        Node root= tree.Buildtree(nodes);
        System.out.println(root.data);
    } 
} 

