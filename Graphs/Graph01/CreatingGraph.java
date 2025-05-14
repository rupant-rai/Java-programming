
import java.util.*;

public class CreatingGraph {
    static class Edge{
        int src;
        int dst;
        public Edge(int s, int d){
            this.dst= d;
            this.src= s;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,1));
        graph[2].add( new Edge(2,3));
        graph[2].add( new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add( new Edge(3,2));
        graph[4].add( new Edge(4,2));
    }

    public static void main( String args[]){
        int V= 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]= new ArrayList[V];
        for ( int i=0; i< V; i++){
            graph[i]= new ArrayList<>();
        }
        createGraph(graph);
        for ( int i=0; i<graph[1].size(); i++){
            Edge e= graph[1].get(i);
            System.out.println(e.dst);
        }
    }
}
