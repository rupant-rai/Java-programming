package functions;
//p to print sum of two number and three numbers
import java.util.*;
public class fxn7{
    public static int sum2(int a,int b){
        return a+b;
    }
    public static int sum3(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println("enter a=");
        Scanner sc = new Scanner (System.in);
        int q=sc.nextInt();
        System.out.println("enter b=");
        int w=sc.nextInt();
        System.out.println("enter c=");
        int e=sc.nextInt();
        sc.close();
        int Sumof2no=sum2(q,w);
        int Sumof3no=sum3(q,w,e);
        System.out.println("sum o ftwo no="+ Sumof2no);
        System.out.println("Sum of three number="+ Sumof3no);
    }
}