
public class HeightOfBT {
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
    //fxn to calculate the height of the tree
    public static int height(Node root){
        // base case
        if(root== null){
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);
        return Math.max(lh,rh)+1;
    }

    //fxn to calculate no of nodes in A BINARY TREE

    public static int count(Node root){
        if( root== null) return 0;
        int lcount= count(root.left);
        int rcount= count( root.right);
        return lcount+ rcount+ 1;
    }

    //fxn to calculate sum of all nodes

    public static int sum( Node root){
        if( root== null) return 0;
        int lsum= sum(root.left);
        int rsum= sum(root.right);
        return lsum+ rsum+ root.data;
    }

    //fxn to calculate the diameter of the tree

    public static int diam1( Node root){
        if( root == null){
            return 0;
        }
        int ld= diam1(root.left); 
        int lh= height(root.left);
        int rd= diam1(root.right);
        int rh= height(root.right);
        int selfDiam= lh+rh+1;
        return Math.max(selfDiam, Math.max(ld, rd));
    }

    // fxn to claculate diamater in linear time

    //first make a class for info
    
    static class Info{
        int diam;
        int ht;

        Info(int diam, int ht){
            this.ht= ht;
            this.diam= diam;
        }
    }
    // now the functon 
    public static Info diame(Node root){
        if( root== null){
            return new Info(0,0);
        }
        Info linfo= diame(root.left);
        Info rinfo= diame(root.right);
        //calculate diameter
        int diam=  Math.max( Math.max(linfo.diam, rinfo.diam), linfo.ht+ rinfo.ht + 1 );
        //calculate ht
        int ht= Math.max( linfo.ht, rinfo.ht)+1;

        return new Info(diam, ht); 

    }

    public static void main( String args[]){
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node (3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node( 6);
        root.right.right= new Node( 7);

        System.out.println(height(root)); 
        System.out.println("Total count of Node in the tree = "+count(root));

        System.out.println("Sum of all nodes = "+ sum(root));

        System.out.println("diameter of the tree = "+ diam1(root));
        System.out.println("diameter of the tree = "+ diame(root).diam);// class ki object ko return krna hai
    }
}
