package Summer_Assignment_25110cn276.Day17;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Union {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of both arrays: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.print("Enter elements in first array: ");
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter elements in second array: ");
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0, j = 0;
        int last = Integer.MIN_VALUE;

        while(i < n && j < m) {

            int val;

            if(arr1[i] < arr2[j]) {
                val = arr1[i++];
            }
            else if(arr1[i] > arr2[j]) {
                val = arr2[j++];
            }
            else {
                val = arr1[i];
                i++;
                j++;
            }

            if(val != last) {
                arr.add(val);
                last = val;
            }
        }

        while(i < n) {
            if(arr1[i] != last) {
                arr.add(arr1[i]);
                last = arr1[i];
            }
            i++;
        }

        while(j < m) {
            if(arr2[j] != last) {
                arr.add(arr2[j]);
                last = arr2[j];
            }
            j++;
        }

        System.out.println("Union Array: " + arr);

        sc.close();
    }
}
