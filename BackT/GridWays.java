//Number of ways to reach from (0,0 ) to (n-1,m-1) in a nxm grid

public class GridWays{
    public static int gway(int i, int j, int n, int m){
        // Base Case
        if( i==n-1&& j==m-1){
            return 1;
        }
        else if( i==n|| j==m){
            return 0;
        }

        int w1=gway(i+1,j,m,n);
        int w2=gway(i,j+1,m,n);

        return w1+w2;
    }
    public static void main(String args[]){
        System.out.println(gway(0,0,3,3));
    }
}


