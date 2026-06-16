package Summer_Assignment_25110cn276.Day11;
import java.util.Scanner;
public class MaximumUsingMethod {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Two number: ");
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.print("the maximum of two number: "+max(n,m));
        sc.close();
    }
    public static int max(int n,int m)
    {
        int max = n>m ? n:m;
        return max;
    }
}
