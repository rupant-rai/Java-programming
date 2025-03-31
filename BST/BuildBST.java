import java.util.*;
public class BuildBST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    } 

    public static Node insert(Node root, int val){
        if(root== null){
            root= new Node(val);
            return root;
        }
        if(root.data>val){
            //insewrt in left subtree
            root.left= insert(root.left, val);
        }
        else{
            //if val > root.data
            root.right= insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root== null) return;
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }

    //fxn fro Bst Search

    public static Boolean search(Node root, int key){
        if(root== null) return false;
        if( root.data== key) return true;
        // if key <root then search in left subtree
        if(root.data>key){
            return search(root.left, key);
        }//if key > root
        else{
            return search(root.right, key);
        }
    }

    //fxn to delete a node

    public static Node delete(Node root, int val){
        if( root.data< val){
            root.right=delete(root.right, val);
        }
        if( root.data> val){
            root.left= delete(root.left, val);
        }
        else{
            // Case 1: leaf Node
            if(root.left== null && root.right== null){
                return null;
            }
            // Case 2: Single child 
            if(root.left == null){
                return root.right;
            }
            else if(root.right== null){//
                return root.left;
            }
            // Case 3: two child

            //finding inorder successor
            Node IS = findInorderSuc(root.right);
            root.data= IS.data;// replacing data
            root.right= delete(root.right, IS.data); // and deleting the the inorder successor
        }
        return root;
    }

    public static Node findInorderSuc(Node root){
        // inorder successor will always be present at the leftmost node of the right tree
        while(root.left!= null){
            root= root.left;
        }
        //else
        return root;
    }


    // fxn to print in range

    public static void printRange(Node root, int k1, int k2){
        if( root== null) return ;
        if(root.data> k1){
            printRange(root.left, k1, k2);
        }
        if(root.data>= k1 && root.data<=k2){
            System.out.print(root.data+" ");
        }
        if(root.data< k2){
            printRange(root.right, k1, k2);
        }
    }

    //fxn to print all the paths from root to all leafs

    public static void printRoot2leaf(Node root, ArrayList<Integer> path){
        if(root== null) return ;
        path.add(root.data);
        //leaf node
        if(root.left== null && root.right== null) {
            printPath(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for( int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    //fxn to check bst is valid or not

    public static Boolean valid(Node root, Node min, Node max){
        if(root== null) return true;
        if(min!=null && root.data <= min.data) return false;
        if(max!= null && root.data >= max.data) return false;
        // check in left and right subtrer
        return valid(root.left,min, root) && valid(root.right, root, max);
    }
    public static void main(String args[]){
        int values[]= {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root= null;
        for( int i=0; i<values.length ;i++){
            root= insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        // if(search(root, 6)){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("not found");
        // }


        // root= delete(root,1);
        // System.out.println();
        // inorder(root);

        // System.out.println("printed range");
        // printRange(root,5, 11);

        // printRoot2leaf(root, new ArrayList<>());

        if(valid(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println(" Not valid");
        }
    }
}
