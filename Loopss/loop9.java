package Loopss;
//p to print input numbers from users till entered number is a multiple of 10
import java.util.*;
public class loop9 {
    public static void main(String args[]){ 
        Scanner sc =new Scanner(System.in);
        do{
            int n=sc.nextInt();
            if(n%10==0)
            break;
            System.out.println(n);
            
        }
        while(true);
        sc.close();
    }

}
