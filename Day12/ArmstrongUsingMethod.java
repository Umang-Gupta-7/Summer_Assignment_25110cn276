package Summer_Assignment_25110cn276.Day12;
import java.util.Scanner;
public class ArmstrongUsingMethod {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(armstrong(n)) System.out.print("Entered number is armstrong");
        else System.out.print("Entered number is not armstrong number");
        sc.close();
    }
    public static boolean armstrong(int n)
    {
        int n1=n,n2=n,c=0,arms=0;
        while(n!=0)
        {
            c++;
            n /=10;
        }
        while(n1!=0)
        {
            arms +=(int)Math.pow(n1%10,c);
            n1 /=10;
        }
        if(arms==n2) return true;
        return false;
    }
}
