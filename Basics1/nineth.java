package Basics1;
import java.util.*;
public class nineth{
    public static void main(String[] args){
        System.out.println("enter marks for evaluation out of 100=");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String status=((marks>=33)?"pass":"fail");
        System.out.println(status);
        sc.close();
    }
}
