import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int n=sc.nextInt(),m,rev=0,r;
        m=n;
        while(n!=0)
        {
            r=n%10;
            rev =rev*10+r;
            n /=10;
        }
        System.out.println("The Reverse of "+m+" = "+rev);
        sc.close();

    }
    
}
