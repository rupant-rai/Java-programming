public class CatalanNumber {
    public static void main(String args[]){
        int n=4;
        System.out.println(catalanRec(n));
    }
    
    public static int catalanRec(int n){
        // base case
        if( n==0|| n==1) return 1;

        int ans=0;

        for( int i=2; i<n+1; i++){
            ans+= catalanRec(i)*catalanRec(n-i-1);
        }
        return ans;
    }
}
