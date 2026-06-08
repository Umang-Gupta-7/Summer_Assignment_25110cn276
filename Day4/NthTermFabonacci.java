package Summer_Assignment_25110cn276.Day4;
import java.util.Scanner;
public class NthTermFabonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int n=sc.nextInt(),a=0,b=1,sum=0;
        
        for(int i=1;i<=n-2;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.print("Nth term fabonacci series="+sum);
        sc.close();
    }
}
