package Summer_Assignment_25110cn276.Day5;
import java.util.Scanner;
public class Factor {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter a number= ");
        int n=sc.nextInt();
        System.out.print("Factor are== ");
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) 
            {
                System.out.print(i +" ");
                if(i !=n/i) System.out.print(n/i+" ");
            }
            
        }
        sc.close();
    }
    
}
