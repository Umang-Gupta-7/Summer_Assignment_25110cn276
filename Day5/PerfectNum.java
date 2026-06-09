package Summer_Assignment_25110cn276.Day5;
import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int n=sc.nextInt(),sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0) sum +=i;
        }
        if(sum==n) System.out.println("Entered number is perfect");
        else System.out.println("Entered number is not perfect");
        sc.close();
    }
    
}
