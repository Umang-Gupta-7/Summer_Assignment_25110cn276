package Summer_Assignment_25110cn276.Day9;
import java.util.Scanner;
public class ReverseStar {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
