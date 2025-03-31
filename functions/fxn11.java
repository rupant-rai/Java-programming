package functions;

import java.util.*;
public class fxn11 {

    //fxns to print average of three numbers
    public static float avg(int a, int b, int c){
        float avg=(a+b+c)/3;
        System.out.println("average of 3 numbers="+avg);
        return 0;
    }



    //even odd using fxns

    public static boolean eo(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    //program to check wheather the number is palindrome or not
    
   


    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b= sc.nextInt();
    //     int c= sc.nextInt();
    //     sc.close();
    //     avg(a,b,c);



         int n= sc.nextInt();
         sc.close();
        System.out.println(eo(n));

    

    }
}



