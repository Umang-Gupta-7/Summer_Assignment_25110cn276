package Summer_Assignment_25110cn276.Day7;
import java.util.Scanner;
public class RecursiveFibonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int fibonacci=fibo(n);
            System.out.print("The nth fibo=="+fibonacci);
        }
        sc.close();
    }
    public static int fibo(int n)
    {
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}
