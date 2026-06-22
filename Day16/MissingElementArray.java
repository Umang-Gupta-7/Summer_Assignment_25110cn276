package Summer_Assignment_25110cn276.Day16;
import java.util.Scanner;
public class MissingElementArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt(),sum=0;
        int[] arr=new int[n];
        System.out.print("Enter element in array: ");
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.print("The missing element in array: "+((n*(n+1))/2-sum));
        sc.close();
    }
}
