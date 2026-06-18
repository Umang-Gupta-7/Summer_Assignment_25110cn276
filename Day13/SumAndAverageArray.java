package Summer_Assignment_25110cn276.Day13;
import java.util.Scanner;
public class SumAndAverageArray {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt(),sum=0;
        int[] arr=new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
         double avg=(double)sum/n;
        System.out.print("The sum and avverage of an array: "+sum+ "\n"+avg);
        sc.close();
    }
}
