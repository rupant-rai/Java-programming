// topological sort is used in DAGs ( directed acyclic graph)
import java.util.*;
public class TopSortDFS {
    static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src= src;
            this.dest= dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for ( int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add( new Edge(0, 0));
        graph[1].add( new Edge(0, 0));
        graph[2].add( new Edge(2, 3));
        graph[3].add( new Edge(3, 1));
        graph[4].add( new Edge(4, 1));
        graph[4].add( new Edge(4, 0));
        graph[5].add( new Edge(5, 0));
        graph[5].add( new Edge(5, 2));
    }

    public static void topSort(ArrayList<Edge> graph[]){
        boolean vis[]= new boolean[graph.length];
        Stack<Integer> s= new Stack<>();
        for ( int i=0; i< graph.length; i++){
            if(!vis[i]){
                topSort2(graph, vis,s, i);
            }
        }
        while( !s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }

    public static void topSort2(ArrayList<Edge> graph[], boolean vis[], Stack<Integer> s, int curr){
        vis[curr]= true;
        // check for its neighbours
        for ( int i=0; i< graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            if(!vis[e.dest]){
                topSort2(graph,vis,s,e.dest);
            }
        }
        s.push(curr);
    }

    public static void main(String args[]){
        int V=6;
        ArrayList<Edge> graph[]= new ArrayList[V];
        createGraph(graph);
        topSort(graph);
    }
}
