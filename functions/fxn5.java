//p to print factorial of the given numbers
package functions;
import java.util.*;

public class fxn5 {
    public static int factorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        } 
        return f; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n= ");
        int n=sc.nextInt();
        sc.close();
        int Factorial=factorial(n);
        System.out.println("factorial of given number ="+Factorial);

    }
}
