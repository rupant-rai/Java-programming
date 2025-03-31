package functions;

public class fxn10 {
    public static void dtb(int dn){
        int mynum=dn;
        int pow=0;
        int bn=0;
        while(dn>0){
            int rem=dn%2;
            bn=bn+(rem*(int)Math.pow(10,pow));
            pow++;
            dn=dn/2; 

        }
        System.out.println("binary form of"+ mynum+"= "+bn);
    }
    public static void main(String[] args){
        dtb(10);
    }
}
