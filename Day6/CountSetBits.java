package Summer_Assignment_25110cn276.Day6;
import java.util.Scanner;
public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 2;

            if (rem == 1) {
                count++;
            }

            n = n / 2;
        }
        System.out.println("Set bits = " + count);
        sc.close();
    }
}
