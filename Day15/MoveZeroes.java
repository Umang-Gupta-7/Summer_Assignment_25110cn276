package Summer_Assignment_25110cn276.Day15;
import java.util.Scanner;
public class MoveZeroes {
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
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                if(i!=j)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        System.out.println("New Array: ");
        for(int ele:arr) System.out.print(ele+" ");
        sc.close();
    }
}
