package Strings;

public class string8 {
    public static String cmprs(String str){
        //using StringBuilder

        // StringBuilder sb= new StringBuilder("");
        // for( int i=0; i<str.length(); i++){
        //     Integer count =1;
        //     while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     sb.append(str.charAt(i));
        //     if(count>1){
        //         sb.append(count.toString());
        //     }
        // }
        // return sb.toString();

        String st= ("");
        for( int i=0; i< str.length(); i++){
           int  count =1;
           while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
            count++;
            i++;
        }
            st+=str.charAt(i);
            if( count>1){
                st+= count;
            }
        }
        return st;
    }
    public static void main( String[] args){
        String str= "aaaabbbbbbccccccccc";
        System.out.println(cmprs(str));

    }
    
}
