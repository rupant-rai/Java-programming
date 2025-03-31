package Loopss;
//program to check whether the number is prime or not
import java.util.*;
public class loop11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        

        if(n==0){
            System.out.println("number is prime");
        }
        else{
            boolean prime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    prime=false;
                }
            }
            if(prime==true){
                System.out.println("number is prime");    
            }
            else{
                System.out.println("number is not prime");
            }
             
            sc.close();
        }
        
    }
}
