
import java.util.PriorityQueue;

public class PQforObj {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name, int rank){
            this.name= name;
            this.rank= rank;
        }
        // fxn to override the above student class using interface comparable
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main( String args[]){
        PriorityQueue<Student> pq= new PriorityQueue<>();
        pq.add(new Student("A",3));
        pq.add(new Student("B",5));
        pq.add(new Student("C",1));
        pq.add(new Student("D",4));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" -> "+pq.peek().rank);
            pq.remove();
        }
    }
}
