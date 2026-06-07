package Summer_Assignment_25110cn276.Day3;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number=");
        int n=sc.nextInt(),m=sc.nextInt();
        int max= (n>m)?n:m;
        while(true)
        {
            if(max%n==0 &&max%m==0)
            {
                System.out.print("Lowest common multiple= "+max);
                break;
            }
            max++;
        }
        sc.close();
    }
    
}
