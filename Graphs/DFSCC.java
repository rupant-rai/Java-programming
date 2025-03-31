import java.util.*;

public class DFSCC {
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

    public static void dfs(ArrayList<Edge> graph[]){
        
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]){

    }
}
