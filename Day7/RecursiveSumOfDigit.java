package Summer_Assignment_25110cn276.Day7;
import java.util.Scanner;
public class RecursiveSumOfDigit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt(),Sum=0;
        Sum=sum(n);
        System.out.print("The sum of digit are: "+Sum);
        sc.close();
    }
    public static int sum(int n)
    {
        if(n < 0) n = -n;
        if(n==0) return 0;
        return (n%10)+sum(n/10);
    }
}
