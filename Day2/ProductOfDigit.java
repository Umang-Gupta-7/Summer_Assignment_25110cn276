package Summer_Assignment_25110cn276.Day2;
import java.util.Scanner;
public class ProductOfDigit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int n=sc.nextInt(),product=1,r,m;
        m=n;
        while(n!=0)
        {
            r=n%10;
            product *=r;
            n /=10;
        }
        System.out.print("The product of digits of "+m+" = "+product);
        sc.close();
    }
    
}
