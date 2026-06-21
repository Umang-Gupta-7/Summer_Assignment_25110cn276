package Summer_Assignment_25110cn276.Day15;
import java.util.Scanner;
public class RotateRightArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        if(n==0)
        {
            sc.close();
            return ;
        }
        System.out.print("Enter element in array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter how many element you want to rotate");
        int m=sc.nextInt();
        m=m%n;
        rotate(arr,n-m,n-1);
        rotate(arr,0,n-m-1);
        rotate(arr,0,n-1);
        System.out.println("Rotate array: ");
        for(int ele:arr) System.out.print(ele+" ");
        sc.close();
    }
    public static void rotate(int[] arr,int i,int j)
    {   
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
