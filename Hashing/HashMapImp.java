import java.util.*;

public class HashMapImp{
    static class HashMap<K,V>{//generics:- these are used when we are not sure about the data type
        public class Node {
            K key;
            V value;
            public Node(K key, V value){
                this.key= key;
                this.value= value;
            }
        }
        private int n;// number of nodes in the Linked list;
        private int N; // number of elements in the array;
        private LinkedList<Node> buckets[];
    
        //constructor of class HashMapImp
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N= 4;
            this.buckets= new LinkedList[4];
            for( int i=0; i<4; i++){
                this.buckets[i]= new LinkedList<>();
            }
        }

        // hash Function
        private int hashFunction(K key){
            int hc= key.hashCode();
            return Math.abs(hc)%N;
        }

        // Search iin ll
        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll= buckets[bi];
            int di=0;
            for( int i=0; i< ll.size(); i++){
                Node node = ll.get(i);
                if( node.key== key){
                    return di;
                }
                di++;
            }
            return -1;
        }
    
        //rehash function
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[]= new LinkedList[N*2];
            N= 2*N;
            for ( int i=0; i< buckets.length; i++){
                buckets[i]= new LinkedList<>();
            }

            //adding nodes in the buckets
            for ( int i=0; i< oldBucket.length; i++){
                LinkedList<Node> ll= oldBucket[i];
                for( int j=0; j<ll.size(); j++){
                    Node node= ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        //put function
        public void put( K key, V value){
            int bi= hashFunction(key);
            int di= SearchInLL(key, bi);
            if( di!=-1){
                Node node= buckets[bi].get(di);
                node.value= value;
            }
            else{
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda =(double)n/N;
            if(lambda> 2.0){
                rehash();
            }
        }

        //containskey function

        public boolean containsKey(K key){
            int bi= hashFunction(key);// bucket index
            int di= SearchInLL(key, bi);// data index

            if( di!=-1){// valid idx
                return true;
            }
            else return false;
        }

        //remove function
        public V remove(K key){
            int bi= hashFunction(key);
            int di= SearchInLL(key, bi);
            if(di!=-1){
                Node node = buckets[bi].remove(di);
                n--;// as soon as the element is removed then decreasing the size
                return node.value;
            }
            else{
                return null;
            }
        }

        // get fucntion

        public V get(K key){
            int bi= hashFunction(key);
            int di= SearchInLL(key,bi);

            if(di!=-1){
                Node node= buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }

        // to print the key set
        public ArrayList<K> keySet(){
            ArrayList<K> keys= new ArrayList<>();
            for ( int i=0; i<buckets.length; i++){
                LinkedList<Node> ll= buckets[i];
                for (Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        
        // is empty function
        public boolean isEmpty(){
            return n==0;
        }

    }

    public static void main(String args[]){
        HashMap<String, Integer> hm= new HashMap<>();// this is not jcf it our hashmap class which we have made above
        hm.put("I", 100);
        hm.put("C", 150);
        hm.put("A", 50);

        ArrayList<String> keys= hm.keySet();
        for (String key: keys){
            System.out.println(key);
        }
        System.out.println(hm.get("I"));
        System.out.println(hm.remove("I")); ;// deleted from the hashMap
        System.out.println(hm.get("I"));
    }
}
