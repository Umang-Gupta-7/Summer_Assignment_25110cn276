import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number=");
        double n=sc.nextDouble();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n +" * "+i +" =" + (n*i));
        }
        sc.close();
    }

    
}
