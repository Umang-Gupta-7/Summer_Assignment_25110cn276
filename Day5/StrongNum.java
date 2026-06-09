package Summer_Assignment_25110cn276.Day5;
import java.util.Scanner;
public class StrongNum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int n=sc.nextInt(),sum=0,n1,r;
        n1=n;
        while(n!=0)
        {
            r=n%10;
            sum +=factorial(r);
            n /=10;
        }
        if(n1==sum) System.out.println("Entered number is strong number");
        else System.out.println("Entered number is not strong number");
        sc.close();
    }
    public static int factorial(int r)
    {
        int fact=1;
        for(int i=1;i<=r;i++)
        {
            fact *=i;
        }
        return fact;   
    }
}
