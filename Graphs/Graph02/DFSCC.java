
import java.util.*;

public class DFSCC {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.dest= d;
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

    public static void dfs(ArrayList<Edge> graph[]){
        boolean vis[]= new boolean[graph.length];
        for (int i=0; i<graph.length; i++){
            if(!vis[i]){
                dfsUtil(graph,i,vis);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]){
        //visit 
        System.out.println(curr+" ");
        vis[curr]= true;
        //for neighbours
        for ( int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            if( !vis[e.dest]){
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    public static void main( String args[]){
        int v=5;
        
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]= new ArrayList[v];
        for ( int  i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        createGraph(graph);
        dfs(graph);
    }
}
