package Summer_Assignment_25110cn276.Day12;
import java.util.Scanner;
public class PerfectNumUsingMethod {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(perfect(n)) System.out.print("Entered number is perfet");
        else System.out.print("Entered number is not perfect number");
        sc.close();
    }
    public static boolean perfect(int n)
    {
        if(n<=1) return false;
        int sum=1;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                 sum+=i;
                if(n/i!=i) sum+=n/i;
            }
        }
        if(sum==n) return true;
        return false;
    }
}
