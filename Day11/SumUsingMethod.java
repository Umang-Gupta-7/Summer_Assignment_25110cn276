package Summer_Assignment_25110cn276.Day11;
import java.util.Scanner;
public class SumUsingMethod {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Two number: ");
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.print("the sum of two number: "+sum(n,m));
        sc.close();
    }
    public static int sum(int n,int m)
    {
        return m+n;
    }
}
