package Summer_Assignment_25110cn276.Day15;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter element in array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.print("Reverse array: ");
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        sc.close();
    }
}
