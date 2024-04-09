// Naive Approach (Linear Search):Linear search through the array. Time complexity: O(n), where n is the number of elements in the array.
package Question1_DSA;
import java.util.Scanner;
public class Naive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int result = findIndexNaive(arr);
        System.out.println("Index where -1 appears: " + result);
    }

    public static int findIndexNaive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                return i;
            }
        }
        return -1; // Should never reach here if input is valid
    }
}