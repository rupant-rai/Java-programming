package Basics1;
import java.util.*;
public class eighth {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no to check wheather it is prime or not");
        int num=sc.nextInt();
        String type=(num%2==0)?"even":"odd";
        System.out.println(type);
        sc.close();
    }
    
    
}
