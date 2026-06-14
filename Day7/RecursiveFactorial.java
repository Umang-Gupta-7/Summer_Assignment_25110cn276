package Summer_Assignment_25110cn276.Day7;
import java.util.Scanner;
public class RecursiveFactorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int fact=factorial(n);
        if(fact==-1) System.out.print("Not define");
        else System.out.print("Factorial of "+n+" = "+fact);
        sc.close();
    }
    public static int factorial(int n)
    {
        if(n < 0)
    {
        return -1;
    }
        if(n==0 || n==1) return 1;
        return n*factorial(n-1); 
    }
}
