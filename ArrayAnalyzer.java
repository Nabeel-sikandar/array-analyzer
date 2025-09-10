import java.util.Scanner;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.println("------Welcome to ARRAY ANALYZER Tool --------");
        System.out.print("Enter the number of elements you want in an Array : ");
        int n = scanner.nextInt();

        // Create array and input numbers
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate statistics
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            sum += num;

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        double average = (double) sum / n;

        // Display results
        System.out.println("\n=== ARRAY ANALYSIS ===");
        System.out.println("Original Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("\n===Statistics===");
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Count of Even numbers: " + evenCount);
        System.out.println("Count of Odd numbers: " + oddCount);

        // Print array in reverse order
        System.out.println("\nArray in Reverse Order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
}