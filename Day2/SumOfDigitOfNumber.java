package Summer_Assignment_25110cn276.Day2;
import java.util.Scanner;
public class SumOfDigitOfNumber {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number= ");
        int n=sc.nextInt(),sum=0,r,m;
        m=n;
        while(n!=0)
        {
            r=n%10;
            sum +=r;
            n /=10;
        }
        System.out.println("The sum of Digit of "+m+" = "+sum);
        sc.close();
    }
    
}
