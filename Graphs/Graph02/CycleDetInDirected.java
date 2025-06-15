import java.util.ArrayList;

public class CycleDetInDirected {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src= s;
            this.dest= d;
        }
    }

    public static void createGraph( ArrayList<Edge> graph[]){
        for ( int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,3));
    }

    public static boolean isCycle( ArrayList<Edge> graph[]){
        boolean vis[]= new boolean [graph.length];
        boolean stack[]= new boolean[graph.length];
        for ( int i=0; i< graph.length; i++){
            if(!vis[i]){
                if(isCycle2(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycle2(ArrayList<Edge> graph[],int curr, boolean vis[], boolean stack[]){
        vis[curr]= true;
        stack[curr]= true;// stack will record that how many more edges can be visitde from that particular edge. if once the  the all edges are visited from that edge , it sets that index with false.
        // it means that if we cannot visit the same vertex agian then there is no chances of cycle formation as cycle is formed when the visited vertex can be again visted by using any other path.
        //for neighbours
        for ( int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!vis[e.dest] && isCycle2(graph,e.dest, vis, stack)){
                return true;
            }
        }
        stack[curr]= false;// as soon as the loop is ended, it means all the edges from an edge is traversed and stack[curr]= false indictae now we cannot reach there by any other way . hence no cycle can be formed.
        return false;
    }

    public static void main( String args[]){
        int V=4;
        ArrayList<Edge> graph[]= new ArrayList[V];
        for ( int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        System.out.println(isCycle(graph));
    }
}
