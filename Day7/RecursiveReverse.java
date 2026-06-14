package Summer_Assignment_25110cn276.Day7;
import java.util.Scanner;
public class RecursiveReverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt(),rev;
        int c=count(n);
        rev=reverse(n,c);
        System.out.print("the reverse of number: "+rev);
        sc.close();
    }
    public static int count(int n)
    {
        if(n < 0) n = -n;
        if(n < 10) return 1;
        return 1 + count(n / 10);
    }
    public static int reverse(int n,int c)
    {
        if(n==0) return 0;
        return (n%10)*(int)Math.pow(10, c-1)+reverse(n/10,c-1);
    }
}
