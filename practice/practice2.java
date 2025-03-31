
// convert first letter of each word in capital letter using string Builder
public class practice2 {
    public static String upper(String str){
        StringBuilder sb= new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for( int i=1; i<str.length(); i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main( String[] args){
        String q= "hi my name is rupant kumar rai";
        System.out.println(upper(q));
    }
}