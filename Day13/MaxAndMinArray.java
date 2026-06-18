package Summer_Assignment_25110cn276.Day13;
import java.util.Scanner;
public class MaxAndMinArray {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt(),max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int[] arr=new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.print("The largest and smallest element: "+max+" "+min);
        sc.close();
    }
}
