package Strings;
//check palindrome
public class string2 {
    public static boolean plndrm( String str){
        for ( int i=0; i<str.length()/2; i++){
            int n= str.length();
            if(str.charAt(i) !=str.charAt(n-i-1)){
                //not palindrome
                System.out.println("not palindrome");
                return false;
            }
        }
        System.out.println("String is palindrome");
        return true;
    }
    public static void main( String[] args){
        String a= "racecar";
        plndrm(a);
        
    }
}
