package Basics1;
import java.util.*;
public class sixth{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter annual income=");
        double inc= sc.nextDouble();
        double tax;

        if(inc<=500000)
        {
            inc=inc-0.10*inc;
            System.out.println("income="+inc);
            tax=inc*0.10;
            System.out.println("tax="+tax);
        }
        else if (inc>500000&&inc<=1000000) {
            inc=inc-0.15*inc;
            System.out.println("income="+inc);
            tax=inc*0.15;
            System.out.println("tax="+tax);
        }
        else
            {inc=inc-0.3*inc;
            System.out.println("income="+inc);
            tax=inc*0.30;
            System.out.println("tax="+tax);}
            sc.close();
    }
}