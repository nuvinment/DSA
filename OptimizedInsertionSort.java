// Optimized Insertion Sort Algorithm
// Time Complexity:
//   Best Case: O(n)  -> Already sorted
//   Average Case: O(n^2)
//   Worst Case: O(n^2)
// Space Complexity: O(1) -> In-place sorting

public class OptimizedInsertionSort {

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from second element
        for (int i = 1; i < n; i++) {

            // Store the current element
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at its correct position
            arr[j + 1] = key;
        }
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        insertionSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
