package functions;
import java.util.*;
public class fxn2 {
    public static void printSum(int n1,int n2){
        int sum=n1+n2;
        System.out.println("sum of two numbers="+sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        printSum(a,b);
        sc.close();
    }
}
