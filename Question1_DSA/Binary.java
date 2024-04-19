package Question1_DSA;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array elements separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int result = findIndexBinarySearch(arr);
        System.out.println("Index where -1 appears: " + result);
    }

    public static int findIndexBinarySearch(int[] arr) {
        int low = 0;
        int high = 1;

        while (high < arr.length && arr[high] != -1) {
            low = high;
            high *= 2;
        }
        if (high >= arr.length) {
            high = arr.length - 1;
        }

        if (arr[0] == -1) {
            return 0;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == -1 && (mid == 0 || arr[mid - 1] != -1)) {
                return mid;
            } else if (arr[mid] == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (arr[arr.length - 1] == -1) {
            return arr.length - 1;
        }

        return -1; // Should never reach here if input is valid
    }
}
