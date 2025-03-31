import java.util.*;

public class lca {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node (int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }

    public static Node Lca( Node root, int n1, int n2){
        ArrayList<Node> path1= new ArrayList<>();
        ArrayList<Node> path2= new ArrayList<>();

        getpath(root, path1, n1 );
        getpath(root, path2, n2);

        //last commmon ancestors
        int i=0;
        for (; i<path1.size() && i<path2.size(); i++){
            if( path1.get(i)!= path2.get(i)){
                break;
            }
        }
        //last equal node is the lca
        return path1.get(i-1);
    }

    public static boolean getpath( Node root, ArrayList<Node> path, int n){
        if( root== null){
            return false;
        }
        path.add(root);

        if(root.data== n){
            return true;
        }
        boolean foundl= getpath(root.left,path, n);
        boolean foundr= getpath( root.right, path, n);

        if( foundl || foundr){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }

    //another approach to calculate the lca// main idea is to check that the subtrees(left and right) 
    //of the node or root conatains n1 or n2
    

    public static Node lca2(Node root, int n1, int n2){
        //base case
        if(root== null|| root.data==n1 || root.data==n2){
            return root;
        }

        Node leftlca= lca2( root.left, n1, n2);
        Node rightlca= lca2( root.right, n1, n2);

        //if leftnca -> val but rightlca -> null

        if(rightlca== null){
            return leftlca;
        }

        if(leftlca== null){
            return rightlca;
        }

        return root;
    }

    //fxn to calculate minimum distance bwtween the two nodes

    public static int minDist( Node root, int n1, int n2){
        Node lca= lca2(root, n1, n2);
        int dist1= lcadist(lca,n1);
        int dist2= lcadist(lca,n2);
        return dist1+ dist2;
    }

    //dist of lca from the node n1 or n2
    public static int lcadist(Node root, int n){
        //Base case;
        if(root== null) return -1;
        if( root.data==n) return 0;

        int leftdist= lcadist(root.left,n);
        int rightdist=lcadist(root.right,n);

        if(leftdist== -1 && rightdist== -1) return -1;
        else if(leftdist== -1) return rightdist+1;
        else return leftdist+1;// if rightdist== -1
    } 


    // fxn to calculate the kth ancestor of the node

    public static int kan( Node root, int n, int k){
        if(root== null) return -1;
        if (root.data== n) return 0;
        // calculate the left and right distance 

        int leftd= kan(root.left,n, k);
        int rightd= kan(root.right,n, k);

        if( leftd== -1 && rightd== -1) return -1;

        //for those condition when any of the left or right distance is valid i.e., greater than -1 or any positive value
        //max between -1 and any other value will always be the positive value,

        int max= Math.max( leftd, rightd);// either leftd or rightd is valid
        //checing if in th eupper level for left and right distance whether it is equal to the kth level 

        if(max+1 == k){
            System.out.println("kth ancestor to the node ="+root.data);
        }
        return max+1;

    }

    public static void main( String args[]){
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node (3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node( 6);
        root.right.right= new Node( 7);

        System.out.println(Lca(root,4,6).data);
        System.out.println(lca2(root, 4,6).data);

        System.out.println("Minimum distance between two nodes = "+minDist(root,4,6));
        kan(root,6,2);
    }
}
