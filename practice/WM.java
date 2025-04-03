import java.util.Scanner;

public class WM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = 0;
        // Validate input
        while (!sc.hasNextInt()) {
            sc.next(); // Consume the invalid input
        }
        w = sc.nextInt();
        sc.close();

        // Check if the weight can be divided into two even parts
        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
