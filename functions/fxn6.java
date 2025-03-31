package functions;
//program to print binomial factors
import java.util.*;
public class fxn6{
    public static int  factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
       }
    public static int bc(int n, int r){
        int factn=factorial(n);
        int factr=factorial(r);
        int factnmr=factorial(n-r);
        int BC=factn/(factr*factnmr);
        return BC;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n=");
        int n=sc.nextInt();
        System.out.println("enter the value of r=");
        int r=sc.nextInt();
        System.out.println(bc(n,r));
        sc.close();
        
    }   
}
