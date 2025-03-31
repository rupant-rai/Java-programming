package Loopss;
//program to print no from 1 to n
import java.util.*;
public class loop3{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int count=1;
        while(count<=n){
            System.out.println(count);
            count++;
        }sc.close();
    }
}