
import java.util.*;
public class practice5 {
    static class Edge{
        int src, dest, wt;
        public Edge(int src, int dest, int wt){
            this.src= src;
            this.dest= dest;
            this.wt= wt;
        }
    }

    public static void main( String args[]){
        Scanner sc= new Scanner( System.in);
        int V= sc.nextInt();
        int E= sc.nextInt();
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]= new ArrayList[V];
        for ( int i=0; i<V; i++){
            graph[i]= new ArrayList<>();
        }

        for ( int i=0; i<E; i++){
            int u= sc.nextInt();
            int v= sc.nextInt();
            int w= sc.nextInt();

            graph[u].add(new Edge(u, v, w));
        }
        System.out.println("DFS");
        dfs(graph);

        System.out.println("BFS");
        bfs(graph);

        sc.close();
    }

    // public static void dfs(ArrayList<Edge> graph[]){
    //     boolean vis[]= new boolean[graph.length];
    //     for ( int i=0; i<graph.length; i++){
    //         if(!vis[i]){
    //             dfs2(graph, i, vis);
    //         }
    //     }
    // }
    // public static void dfs2(ArrayList<Edge> graph[], int curr, boolean vis[]){
    //     System.out.println(curr+" ");
    //     vis[curr]= true;
    //     for( int i=0; i<graph[curr].size(); i++){
    //         Edge e= graph[curr].get(i);
    //         if(!vis[e.dest]){
    //             //recursive cal to its neighbour
    //             dfs2(graph, e.dest, vis);
    //         }
    //     }
    // }

    // public static void bfs( ArrayList<Edge> graph[]){
    //     boolean vis[]= new boolean[graph.length];
    //     for ( int i=0; i<graph.length; i++){
    //         if(!vis[i]){
    //             bfs2(graph, vis);
    //         }
    //     }
    // }
    // public static void bfs2(ArrayList<Edge> graph[], boolean vis[]){
    //     Queue<Integer> q= new LinkedList<>();
    //     q.add(0);
    //     while(!q.isEmpty()){
    //         int curr= q.remove();
    //         if(!vis[curr]){
    //             System.out.println(curr+" ");
    //             vis[curr]= true;
    //             //neighbours
    //             for ( int i=0; i< graph[curr].size(); i++){
    //                 Edge e= graph[curr].get(i);
    //                 q.add(e.dest);
    //             }
    //         }
    //     }
    // }


    public static void bfs(ArrayList<Edge> graph[]){
        boolean vis[]= new boolean[graph.length];
        for ( int i=0; i<graph.length; i++){
            if(!vis[i]){
                bfsutil(graph, vis);
            }
        }
    }
    public static void bfsutil(ArrayList<Edge> graph[], boolean vis[]){
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr= q.remove();
            if(!vis[curr]){
                System.out.println(curr+" ");
            vis[curr]= true;
            // add its neighbours in the queue
            for ( int i=0; i<graph[curr].size(); i++ ){
                Edge e= graph[curr].get(i);
                q.add(e.dest);
            }
            }
        }
    }

    public static void dfs( ArrayList<Edge> graph[]){
        boolean vis[]= new boolean[graph.length];
        for ( int i=0; i<graph.length; i++){
            if(!vis[i]){
                dfsutil(graph, i, vis);
            }
        }
    }

    public static void dfsutil(ArrayList<Edge> graph[], int curr, boolean vis[]){
        //visit:- we have to print 
        System.out.println(curr+" ");
        vis[curr]= true;
        for( int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            if(!vis[e.dest]){
                dfsutil(graph, e.dest, vis);
            }
        }
    }
}
