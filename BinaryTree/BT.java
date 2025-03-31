import java.util.*;
public class BT{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    } 
    
    static class BinaryTree{
        //building a tree
        static int idx= -1;
        public Node buildTree(int nodes[]){
            idx++;
            if( nodes[idx] == -1){
                return null;
            }
            Node newNode= new Node( nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }

        //fxn to make preorder
        public void preOrder( Node root){
            if(root== null){
                return; 
            }
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        
        // fxn for inorder
        public void inOrder(Node root){
            if( root== null){
                return;
            }
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }

        // fxn for postOrder

        public void postOrder( Node root){
            if(root== null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data+" ");
        }

        // fxn for level order

        public void levelOrder( Node root){
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode= q.remove();
                if(currNode== null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.println(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!= null){
                        q.add( currNode.right);
                    }
                }
            }
        }
    }

    public static void main( String args[]){
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTree(nodes);
        // System.out.println(root.data);
        System.out.println("preorder");
        tree.preOrder(root);
        System.out.println("Inorder");
        tree.inOrder(root);
        System.out.println("postOrder");
        tree.postOrder(root);
        System.out.println("Level Order");
        tree.levelOrder(root);
    }
}