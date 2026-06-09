package Summer_Assignment_25110cn276.Day5;
import java.util.Scanner;
public class PrimeFactor {
    public static boolean Prime(int n)
    {
        if(n < 2) return false;

        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number= ");
        int n = sc.nextInt();

        int largest = -1;

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0 && Prime(i))
            {
                largest = i;
            }
        }

        System.out.println("Largest Prime Factor = " + largest);

        sc.close();
    }
}
    

