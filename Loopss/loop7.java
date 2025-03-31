package Loopss;
//p to reverse the number and store it in a variable
import java.util.*;
public class loop7 {
    public static void main(String args[]){
        System.out.println("enter n=");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0;
        while(n>0){
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        System.out.println("reverse="+rev);
        sc.close();
    }

    
}
