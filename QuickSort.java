// Quick Sort Algorithm
// Time Complexity:
//   Best & Average Case: O(n log n)
//   Worst Case: O(n^2)
// Space Complexity: O(log n) -> Recursive stack

public class QuickSort {

    // Method to perform quick sort
    public static void quickSort(int[] arr, int low, int high) {

        // Check if array can be divided
        if (low < high) {

            // Partition the array
            int pi = partition(arr, low, high);

            // Sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Method to partition the array
    private static int partition(int[] arr, int low, int high) {

        // Choose last element as pivot
        int pivot = arr[high];
        int i = low - 1;

        // Rearrange elements
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
