import java.util.Scanner;
public class SumOfFirstN {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a natural number=");
        int n=sc.nextInt();
        System.out.println("Sum of first N natural ="+((n+1)*n/2));
        sc.close();
    }
    
}