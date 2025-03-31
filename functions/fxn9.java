package functions;

public class fxn9 {
    public static void btd(int bn){
        int mynum=bn;
        int pow=0;
        int dec=0;
        while(bn>0){
            int ld=bn%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            pow++;
            bn=bn/10;
        }
        System.out.println("decimal number of "+mynum+"="+dec);
    }
    public static void main(String[] args){
        btd(111101);
    }
}
