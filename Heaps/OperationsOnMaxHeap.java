import java.util.*;

public class OperationsOnMaxHeap {
    static class Heap{
        ArrayList<Integer> al= new ArrayList<>();
        public void add(int data){
            al.add(data);
            int child= al.size()-1;
            int par= (child- 1)/2;
            while(al.get(child)> al.get(par)){
                // swap
                int temp= al.get(child);
                al.set(child, al.get(par));
                al.set(par, temp);

                child= par;
                par= (child-1)/2;
            }
        }

        public int peek(){
            return al.get(0);
        }

        public int remove(){
            int data= al.get(0);
            // swap
            int temp= al.get(0);
            al.set(0, al.get(al.size()-1));
            al.set(al.size()-1, temp);

            // Delete last Node 
            al. remove(al.size()-1);

            // fix heap

            heapify(0);
            return data;
        }

        private void heapify(int i){
            int left= 2*i+1;
            int right= 2*i+2;
            int maxIdx= i;

            if(left< al.size() && al.get(maxIdx)< al.get(left)){
                maxIdx=left;
            }
            if(right< al.size() && al.get(maxIdx)< al.get(right)){
                maxIdx= right;
            }

            if(maxIdx!= i){
                // swap
                int temp= al.get(i);
                al.set(i, al.get(maxIdx));
                al.set(maxIdx, temp);

                heapify(maxIdx);
            }
        }

        public boolean isEmpty(){
            return al.size()== 0;
        }
    }

    public static void main(String args[]){
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
