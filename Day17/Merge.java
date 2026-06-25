package Summer_Assignment_25110cn276.Day17;
import java.util.Scanner;
public class Merge {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of both array: ");
        int n=sc.nextInt(),m=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        int[] arr3=new int[n+m];
        System.out.print("Enter element in first arr in sorted manner: ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter element in second arr in sorted manner: ");
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<=arr2[j]) arr3[k++]=arr1[i++];
            else if(arr1[i]>arr2[j]) arr3[k++]=arr2[j++];
        }
        while(i<n) arr3[k++]=arr1[i++];
        while(j<m) arr3[k++]=arr2[j++];
        System.out.print("The new merge array: ");
        for(int ele:arr3) System.out.print(ele+" ");
        sc.close();
    }
}
