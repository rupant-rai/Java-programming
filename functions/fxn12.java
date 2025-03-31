package functions;
import java.util.*;
public class fxn12 {
    public static boolean palindrome(int n){

        int pal=n;
        int rev=0;
        while(pal>0){
            int rem= pal%10;
            rev= rev*10+rem;
            pal=pal/10;
            if(rev!=n);
        }
        if(n==rev){
            return true;
        }
        else{
            return false;
        }
    }

    //sum of digits in an integer

    public static void digitSum(int n){
        int sum=0;
        while(n!=0){
            int ld=n%10;
            sum = sum+ ld;
            n= n/10;
        }
        System.out.println("sum of digits="+sum);
    } 
    public static void main(String[] args){
       Scanner sc= new Scanner( System.in);
        int pal=sc.nextInt();
        sc.close();
        if(palindrome(pal)){
            System.out.println("p");
        }
        else{
            System.out.println("np");
        }



        // Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        // sc.close();
        // digitSum(n);
    }
}