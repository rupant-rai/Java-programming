package Loopss;
//program to reverse a number
import java.util.*;
public class loop6{
    public static void main(String args[]){
        System.out.println("Enter the number=");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        while( n>0)
        {
            int ld =n%10; 
            System.out.print(ld+" ");
            n=n/10;
        }
        System.out.println();
        sc.close();
    }
} 