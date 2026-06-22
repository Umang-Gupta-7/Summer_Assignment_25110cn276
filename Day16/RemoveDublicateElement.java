package Summer_Assignment_25110cn276.Day16;
import java.util.Scanner;
import java.util.Arrays;
public class RemoveDublicateElement {
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
        Arrays.sort(arr);
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.print("the new array: ");
        for(int i=0;i<=j;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
