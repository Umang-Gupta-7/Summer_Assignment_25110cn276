package Summer_Assignment_25110cn276.Day4;
import java.util.Scanner;
public class CheckArmstrong {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int n=sc.nextInt(),n1,n2,d=0,arms=0,r;
        n1=n;
        while(n!=0)
        {
            d++;
            n /=10;
        }
        n2=n1;
        while(n1!=0)
        {
            r=n1%10;
            arms += (int)Math.pow(r,d);
            n1 /=10;
        }
        if(arms==n2) System.out.println("Entered number is armstrong");
        else System.out.println("Entered number is not armstrong");
        sc.close();
    }    
}
