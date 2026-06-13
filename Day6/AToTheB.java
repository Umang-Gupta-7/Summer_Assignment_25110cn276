package Summer_Assignment_25110cn276.Day6;
import java.util.Scanner;
public class AToTheB {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number like aToThePowerB= ");
        int a=sc.nextInt(),b=sc.nextInt(),pow=1;
        for(int i=1;i<=b;i++)
        {
            pow *=a;
        }
        System.out.println(a+"ToThePower"+b+" = "+pow);
        sc.close();
    } 
}
