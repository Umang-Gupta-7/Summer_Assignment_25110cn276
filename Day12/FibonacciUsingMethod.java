package Summer_Assignment_25110cn276.Day12;
import java.util.Scanner;
public class FibonacciUsingMethod {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        fibonacci(n);
        sc.close();
    }
    public static void fibonacci(int n)
    {
        int a=0,b=1,sum;
        if(n==1) System.out.print("the fibonacci serie: "+a);
        else if(n==2) System.out.print("the fibonacci series: "+a+" "+b);
        else
        {
            System.out.print("the fibonacci series: "+a+" "+b+" ");
            for(int i=1;i<=n-2;i++)
            {
                sum=a+b;
                System.out.print(sum+" ");
                a=b;
                b=sum;
            }
        }
    }
}
