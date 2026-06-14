package Summer_Assignment_25110cn276.Day8;
import java.util.Scanner;
public class HalfPyramidCharacter {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=65;j<=i+64;j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
        sc.close();
    }
}
