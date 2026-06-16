package Summer_Assignment_25110cn276.Day11;
import java.util.Scanner;
public class PrimeUsingMethod {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(prime(n)) System.out.println("Entered number is prime number");
        else System.out.println("Entered number is not prime number");
        sc.close();
    }
    public static boolean prime(int n)
    {
        if(n<2) return false;
        else
        {
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0) 
                {
                    return false;
                }
            }
            return true;
        }
    }
}
