package Arrays;
//program to print pairs of elements of the array
public class arrays6 {
    public static void pairs(int num[]){
        int tp=0;
        for( int i =0; i<num.length-1; i++){
            int current= num[i];//2,3,4,5,6,7,8
            for(int j=i+1; j< num.length; j++){
                System.out.print("("+ current+ ","+ num[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs= "+ tp);
    } 
    public static void main( String[] args){
        int num[]= {2,3,4,5};
        pairs(num);
    }
}
