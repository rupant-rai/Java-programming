//p to swap two numbers
package functions;
import java.util.*;
public class fxn3{
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("a=");
    int a=sc.nextInt();
    System.out.println("b=");
    int b=sc.nextInt();
    sc.close();
    swap(a,b);
   

}
}