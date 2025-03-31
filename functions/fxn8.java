package functions;
//p to find whether the number is prime or not using functions.
public class fxn8 {
    // public static boolean prime(int n){
    //     if(n==2||n==1){
    //         return true;
    //     }
        
    //     for(int i=2;i<=n-1;i++){
    //         if (n%i==0){
    //           return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main( String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the value of n=");
    //     int n=sc.nextInt();
    //     sc.close();
    //     boolean Isprime=prime(n);
    //     System.out.println(Isprime);
    // }

//p to find prime number in the range of 2 to n
    public static boolean prime(int n){ 
        boolean prime=true;
        for ( int i=2;i<=n-1;i++){
            if(n%i==0){
            prime=false;
            break;
            }
        }return prime;
    }
    public static void primesinrange(int m){
        for(int i=2; i<=m; i++) {
            if(prime(i)){
                System.out.print(" "+ i);
            }
        }
        System.out.println();  
    }
    public static void main(String[] args){
        primesinrange(100);
    }
}