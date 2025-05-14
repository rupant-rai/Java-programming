
import java.util.*;

public class HasPath {
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

    public static boolean HassPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]){
        if( src== dest) return true;
        vis[src]= true;
        for ( int i=0; i<graph[src].size(); i++){
            Edge e= graph[src].get(i);
            if(!vis[e.dst] && HassPath(graph, e.dst, dest, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int V= 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]= new ArrayList[V];
        for ( int i=0; i<V; i++){
            graph[i]= new ArrayList<>();
        }
        createGraph(graph);
        System.out.println(HassPath(graph, 0, 4, new boolean[V]));
    }
}
