package Basics1;
import java.util.*;
public class fourth{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age=");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("can vote and drive.");
        }
        else if(age>=13 && age<18)
            System.out.println("teenager");    
        
        else  {
            System.out.println("not the legal age"); 
        }sc.close();
    } 
}
 