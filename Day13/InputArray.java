package Summer_Assignment_25110cn276.Day13;

import java.util.Scanner;

public class InputArray {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Your array is: ");
        for(int ele: arr) System.out.print(ele+" ");
        sc.close();
    }
}
