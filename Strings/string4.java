package Strings;
//substring

public class string4 {
    public static String Substring( String str, int si, int ei){
        String substr= "";
        for( int i=si; i< ei; i++){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static void main( String [] args){
        String a="helloworld";
        System.out.println(Substring(a,0,5));

        //inbuilt function in the java to print substring
         System.out.println(a.substring(0,5));
    }
    
}
 