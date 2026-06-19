package Summer_Assignment_25110cn276.Day14;
import java.util.Scanner;
public class Dublicate {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt(),dub=Integer.MAX_VALUE;
        int[] arr=new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(dub!=arr[i]) 
                {
                    if(arr[i]==arr[j]) 
                    {
                        dub =arr[i];
                        System.out.print(arr[i]);
                        break;
                    }
                }
            }
            
        }
        sc.close();
    }
}
