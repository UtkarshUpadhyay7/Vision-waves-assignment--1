//4. Reverse an Array
//Problem Statement:
// Given an array of product IDs, reverse the array and display it.
package assignment;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

    	// 1] Creating an Scanner Class
        Scanner sc = new Scanner(System.in);

        // Taking input for  size 
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        // Initialize the array 
        int[] arr = new int[n];
 
        // 4]  Take array from users
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   
        }

        System.out.println("Reversed Array:");

        // 5] Print in reverse order
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
