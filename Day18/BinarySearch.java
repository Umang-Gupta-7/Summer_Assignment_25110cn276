package Summer_Assignment_25110cn276.Day18;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        int low = 0;
        int high = n - 1;
        boolean found = false;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if(!found)
            System.out.println("Element not found");

        sc.close();
    }
}
