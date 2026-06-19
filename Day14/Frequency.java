package Summer_Assignment_25110cn276.Day14;
import java.util.Scanner;
public class Frequency {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt(),count=0;
        int[] arr=new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter frequency element: ");
        int x=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)  count++;
        }
        if(count == 0) System.out.println("Element not found");
        else   System.out.println("Frequency of given element is: " + count);
        sc.close();
    }
}
