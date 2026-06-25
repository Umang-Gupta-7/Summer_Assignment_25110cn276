package Summer_Assignment_25110cn276.Day17;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Intersection {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of both array: ");
        int n=sc.nextInt(),m=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        System.out.print("Enter element in first arr: ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter element in second arr: ");
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j]) i++;
            else if(arr1[i]>arr2[j]) j++;
            else if(arr1[i]==arr2[j]) 
            {
                arr.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.print(arr);
        sc.close();
    }
}
