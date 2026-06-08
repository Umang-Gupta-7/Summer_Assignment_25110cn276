package Summer_Assignment_25110cn276.Day4;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower and upper range= ");
        int n=sc.nextInt(),m=sc.nextInt(),n1,n2,d,arms,r,n3;
        System.out.print("Armstrong numbers in range "+n+"-"+m+" ");
        for(int i=n;i<=m;i++)
        {
            n1=i;
            n2=n1;
            d=0;
            arms=0;
            r=0;
            while(n1 !=0)
            {
                d++;
                n1 /=10;
            }
            n3=n2;
            while(n2 !=-0)
            {
                r=n2%10;
                arms += (int)Math.pow(r,d);
                n2 /=10;
            }
            if(arms==n3) System.out.print(arms+" ");

        }
        sc.close();
    }
    
}
