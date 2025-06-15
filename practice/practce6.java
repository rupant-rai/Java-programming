import java.util.*;

public class practce6 {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src= src;
            this.dest= dest;
        }
    }

    public static boolean HasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]){
        if( src== dest) return true;
        vis[src]= true;
        for ( int i=0; i<graph[src].size(); i++){
            Edge e= graph[src].get(i);
            if( !vis[e.dest] && HasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        int E= sc.nextInt();
        int V= sc.nextInt();
        ArrayList<Edge> graph[]= new ArrayList[V];
        for ( int i=0; i<V; i++){
            graph[i]= new ArrayList<>();
        }

        for ( int i=0; i<E; i++){
            int u= sc.nextInt();
            int v= sc.nextInt();
            graph[u].add(new Edge(u, v));
        }
        sc.close();
        System.out.println(HasPath(graph, 2, 4, new boolean[V]));
    }
}
