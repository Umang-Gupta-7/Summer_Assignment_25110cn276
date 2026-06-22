package Summer_Assignment_25110cn276.Day16;
import java.util.Arrays;
import java.util.Scanner;
public class PairSum {
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
        System.out.print("Enter the target number: ");
        int target=sc.nextInt();
        Arrays.sort(arr);
        int i=0,j=n-1;
        boolean found=false;
        while(i<j)
        {
            if(arr[i]+arr[j]<target) i++;
           else if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]==target) 
            {
                System.out.print(arr[i]+","+arr[j]);
                i++;
                j--;
                found=true;
            }
        }
        if(!found) System.out.print("Pair does not exist");
        sc.close();
    }

}
