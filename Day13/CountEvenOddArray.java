package Summer_Assignment_25110cn276.Day13;
import java.util.Scanner;
public class CountEvenOddArray {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt(),CountEven=0,CountOdd=0;
        int[] arr=new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0) CountEven++;
            else CountOdd++;
        }
        System.out.print("The total number of even and odd element in array: "+CountEven+" "+CountOdd);
        sc.close();
    }
}
