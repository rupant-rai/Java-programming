package Arrays;
//program to print reverse of an array
public class arrays5 {
    public static void revar (int num[]){
        int start =0;
        int end=num.length-1;
        while( start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int num[]={2,3,5,7,3,5,8,10};
        revar(num);
        for(int i=0; i<=num.length; i++){
            System.out.print(num[i]+ " ");
        }
    }
    
}
