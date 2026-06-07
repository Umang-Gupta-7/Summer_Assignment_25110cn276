package Summer_Assignment_25110cn276.Day3;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number= ");
        int n=sc.nextInt(),m=sc.nextInt(),Gcd=0;
        for(int i=1;i<=n&&i<=m;i++)
        {
            if(n%i==0 &&m%i==0) Gcd=i;
        }
        System.out.print("Highest Common factor ="+Gcd);
        sc.close();
    }

    
}
