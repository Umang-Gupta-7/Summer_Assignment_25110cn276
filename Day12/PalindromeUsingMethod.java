package Summer_Assignment_25110cn276.Day12;
import java.util.Scanner;
public class PalindromeUsingMethod {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(palindrome(n)) System.out.print("Entered number is palindrome");
        else System.out.print("Entered number is not palindrome number");
        sc.close();
    }
    public static boolean palindrome(int n)
    {
        int n1=n,rev=0,r;
        while(n!=0)
        {
            r=n%10;
            rev= rev*10+r;
            n /=10;
        }
        if(rev==n1) return true;
        return false;
    }
}
