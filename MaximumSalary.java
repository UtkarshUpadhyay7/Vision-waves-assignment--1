package assignment;
import java.util.Scanner;

public class MaximumSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of salaries:");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the salaries:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int maxsalary = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > maxsalary) {   
                maxsalary = array[i];    
            }
        }

        System.out.println("Highest Salary = " + maxsalary);

        sc.close();
    }
}
