package Summer_Assignment_25110cn276.Day16;
import java.util.Scanner;
public class MaximumFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxFreq = 0;
        int element = arr[0];
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > maxFreq) {
                maxFreq = count;
                element = arr[i];
            }
        }
        System.out.println("Maximum frequency element: " + element);
        System.out.println("Frequency: " + maxFreq);
        sc.close();
    }
}