package Summer_Assignment_25110cn276.Day4;
import java.util.Scanner;
public class Fabonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int n=sc.nextInt(),a=0,b=1,sum=0;
        System.out.print("The fabonacci series upt "+n+" = "+a+" "+b+" ");
        for(int i=1;i<=n-2;i++)
        {
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
        sc.close();
    }    
}
