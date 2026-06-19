package Summer_Assignment_25110cn276.Day14;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt();
        boolean flag=false;
        int[] arr=new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter search element: ");
        int x=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x) 
            {
                flag=true;
                break;
            }
        }
        if(flag) System.out.print("Search successful");
        else System.out.print("Search unsuccessful");
        sc.close();
    }
}
