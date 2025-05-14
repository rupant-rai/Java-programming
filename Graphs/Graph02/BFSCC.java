
import java.util.*;

public class BFSCC {
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

    public static void bfs(ArrayList<Edge> graph[]){
        boolean vis[]= new boolean[graph.length];
        for ( int i=0; i< graph.length; i++){
            if(!vis[i]){
                bfsUtil(graph, vis);
            }
        }
    }

    public static void bfsUtil( ArrayList<Edge> graph[], boolean vis[]){
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr= q.remove();
            if( !vis[curr]){
                System.out.println(curr+ " ");
                vis[curr]= true;
                for ( int i=0; i< graph[curr].size(); i++){
                    Edge e= graph[curr].get(i);
                    q.add(e.dst);// adding the neighbour
                }
            }
        }
    }

    public static void main( String args[]){
        int V= 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]= new ArrayList[V];
        for ( int i=0; i< graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        createGraph(graph);
        bfs(graph);
    }
}
