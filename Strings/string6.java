package Strings;

public class string6 {
    public static void main(String[] args){
        StringBuilder  sb= new StringBuilder("");
        for( char ch='a'; ch<='z'; ch++){
            //this function is use to add anything in the last of the string
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}
