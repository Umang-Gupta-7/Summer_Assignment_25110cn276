package Summer_Assignment_25110cn276.Day10;
import java.util.Scanner;
public class CharacterPyramid {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=65;k<=64+i;k++)
            {
                System.out.print((char)k+" ");
            }
            for(int l=64+i-1;l>=65;l--)
            {
                System.out.print((char)l+" ");
            }
            System.out.println();
        }
        sc.close();
    }   
}
