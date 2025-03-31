//p to find product of two numbers
package functions;
import java.util.*;
public class fxn4 {
    public static int mult(int n1,int n2){
    int prod=n1*n2;
    //System.out.println("product of two numbers="+prod);
    return prod;
    }
    public static void main(String[] args){
        System.out.println("enter a=");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("entr b=");
        int b=sc.nextInt();
        sc.close();
       int product= mult(a,b); 
       System.out.println("product of two numbers="+product);
       product=mult(10,50);
       System.out.println("a*b="+product);

    }
} 

