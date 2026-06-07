package Summer_Assignment_25110cn276.Day3;
import java.util.Scanner;
public class PrimeNumInRange {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower and upper range =");
        int n=sc.nextInt(),m=sc.nextInt();
        boolean found=true;
        System.out.print("The prime number in range "+n+"-"+m+"= ");
        for(int i=n;i<=m;i++)
        {
            boolean flag=false;
            if(i<2) 
            {
                continue;
            }
            else
            {
                for(int j=2;j<=Math.sqrt(i);j++)
                {
                    if(i%j==0)
                    {
                        flag=true;
                        break;
                    }
                }
            }
            if(flag==false)
            {
                System.out.print(i+" ");
                found=false;
            }
        }
        if(found==true) System.out.print("Not found any prime number");
        sc.close();
    }
    
}
