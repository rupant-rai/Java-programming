package Basics1;
import java.util.*;
public class seventh{
    public static void main(String args[]){
        System.out.println("enter three numbers=");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if(a>=b&& a>=c)
        System.out.println("a is grater");
        else if(b>=c)
        System.out.println("b is greater");
        else
        System.out.println("c is greater");
        sc.close();     
    }
}
