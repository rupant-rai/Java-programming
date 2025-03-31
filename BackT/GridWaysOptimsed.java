public class GridWaysOptimsed {
   public static int fact( int n){
    // Base Case
    if(n==0){
        return 1;
    }
    //kam
    int fnm1= fact(n-1);
    int facto= n*fnm1;
    
    return facto;
    }
     
    public static int Gways( int n, int m){
        int ways= fact((n-1)+(m-1))/(fact(n-1)*fact(m-1));
        return ways;
    }

    public static void main( String args[]){
        System.out.println(Gways(3,3));
    }
}
