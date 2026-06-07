package Summer_Assignment_25110cn276.Day3;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int n=sc.nextInt();
        boolean flag=false;
        if(n<=1) System.out.print("Not Prime");
        else
            {
                for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(flag==false) System.out.print("Entered Number is prime");
        else  System.out.print("Enter number is not prime");
            }
        sc.close();
    }
}
