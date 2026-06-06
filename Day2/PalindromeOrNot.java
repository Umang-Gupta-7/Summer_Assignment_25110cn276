import java.util.Scanner;
public class PalindromeOrNot {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=sc.nextInt(),m,r,rev=0;
        m=n;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n /=10;
        }
        if(m==rev) System.out.println("Enter number is palindrome");
        else System.out.println("Enter number is not palindrome");
        sc.close();
    }
    
}
