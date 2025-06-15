
import java.util.*;

// bipartite graph is a graph  whose vertices can be divide into
// two sets such that every edge either connects a vertes from 
// u to v pr a veertex from v to u.
// we can also say that there is no edeg that connects vertices of same set.
// we use dfs appraoch
public class BipartiteGraph {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src= s;
            this.dest= d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for ( int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add( new Edge(0,1));
        graph[0].add( new Edge(0,2));
        
        graph[1].add( new Edge( 1,0));
        graph[1].add( new Edge( 1,3));

        graph[2].add( new Edge( 2,0));
        graph[2].add( new Edge( 2,4));

        graph[3].add( new Edge( 3,1));
        graph[3].add( new Edge( 3,4));

        graph[4].add( new Edge( 4,3));
        graph[4].add( new Edge( 4,2));
    }
    
    public static boolean isBG(ArrayList<Edge> graph[]){
        int col[]= new int[graph.length];
        for( int i=0; i<graph.length; i++){
            col[i]=-1;
        }
        Queue<Integer> q= new LinkedList<>();
        for ( int i=0; i< graph.length; i++){
            if(col[i]==-1){// BFS
                q.add(i);
                col[i]=0;
                while( q.isEmpty()){
                    int curr= q.remove();
                    // call for its children or neighbour
                    for ( int j=0; j<graph[curr].size(); j++){
                        Edge e= graph[curr].get(i);
                        if(col[e.dest]==-1){
                            int nextCol= col[curr]==0?1:0;
                            col[e.dest]= nextCol;
                            q.add(e.dest);
                        }
                        else if(col[e.dest]== col[curr]) return false;
                    }
                }
            }
        }
        return true;
    } 
    
    public static void main(String args[]){
        int V=5;
        ArrayList<Edge> graph[]= new ArrayList[V];
        for (int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        System.out.println(isBG(graph));
    }
}
