import java.util.*;

public class OperationsOnMInHeap{
    static class Heap{
        ArrayList<Integer> al= new ArrayList<>();
        public void add(int data){
            al.add(data);// adding the data in the end of the arraylist
            int x = al.size()-1;// x is the child 
            int par= (x-1)/2;// parents index

            while (al.get(x)<al.get(par)) {
                //swap
                int temp= al.get(x);
                al.set(x,al.get(par));
                al.set(par,temp);

                x= par;
                par= (x-1)/2;
            }
        }
        public int peek(){
            return al.get(0);
        }

        public int remove(){
            int data= al.get(0);
            //swap
            int temp= al.get(0);
            al.set(0,al.get(al.size()-1));
            al.set(al.size()-1, temp);

            // delete the last node
            al.remove(al.size()-1);
            // fix heap
            heapify(0);
            return data;
        }

        private void heapify(int i){
            int left=2*i+1;
            int right= 2*i+2;
            int minIdx= i;
            if( left< al.size() && al.get(minIdx)> al.get(left)){
                minIdx= left;
            }

            if(right< al.size() && al.get(minIdx)> al.get(right)){
                minIdx= right;
            }

            if(minIdx!= i){
                //swap
                int temp = al.get(i);
                al.set(i, al.get(minIdx));
                al.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public boolean isEmpty(){
            return al.size()== 0;
        }
    }
    public static void main( String args[]){
        Heap h= new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}