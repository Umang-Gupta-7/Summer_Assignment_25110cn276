package Summer_Assignment_25110cn276.Day18;
import java.util.Scanner;
public class SelectionSort {
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
        for(int i=0;i<n-1;i++)
        {
            int min=Integer.MAX_VALUE,index=-1;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        System.out.println("New sorted array: ");
        for(int ele:arr) System.out.print(ele+" ");
        sc.close();
    }
}
