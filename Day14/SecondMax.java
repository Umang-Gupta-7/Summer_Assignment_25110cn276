package Summer_Assignment_25110cn276.Day14;
import java.util.Scanner;
public class SecondMax {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt(),max=Integer.MIN_VALUE,Secmax=Integer.MIN_VALUE;
        int[] arr=new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max) max=arr[i];
        }
        if(n<2) System.out.print("Second largest element not exist");
        else
        {   
            for(int i=0;i<n;i++)
            {
                if(arr[i]>Secmax && arr[i]!=max) Secmax=arr[i];
            }
            if(Secmax == Integer.MIN_VALUE) 
                System.out.println("Second largest element does not exist.");
            else
                System.out.println("Second largest element: " + Secmax);
        }
        sc.close();
    }
}
