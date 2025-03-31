package Loopss;

//program to print sum of first n natural numbers
import java.util.*;
public class loop4{
    public static void main(String[] args){
        System.out.println("Enter value of n=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("sum of numbers ="+sum);
        sc.close();
    }
}