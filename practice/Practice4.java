import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        int nums[]= new int[12];
        for ( int i=0; i<12; i++){
            nums[i]=sc.nextInt();
            if(nums[i]<0)
            {
                System.out.println("Invalid");
                return;
            }
        }
        
        task(nums);
        sc.close();
    }
    
    public static void task(int nums[]){
        for ( int i=0; i<nums.length; i++){
            System.out.println(nums[i]+" ");
        }
    }
}
