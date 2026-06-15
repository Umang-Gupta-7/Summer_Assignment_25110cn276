package Summer_Assignment_25110cn276.Day9;
import java.util.Scanner;
public class HalfPyramidRepeatedCharacter {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt(),a=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)a);
            }
            a++;
            System.out.println();
        }
        sc.close();
    }
}
