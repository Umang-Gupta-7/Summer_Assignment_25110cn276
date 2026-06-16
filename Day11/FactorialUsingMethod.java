package Summer_Assignment_25110cn276.Day11;
import java.util.Scanner;
public class FactorialUsingMethod {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("the factorial of entered number: "+factorial(n));
        sc.close();
    }
    public static int factorial(int n)
    {
        if(n==0) return 0;
        else 
        {
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact *=i;
            }
            return fact;
        } 
    }
}
