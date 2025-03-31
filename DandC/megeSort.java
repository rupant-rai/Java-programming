package DandC;

public class megeSort {
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function for merge sort
    public static void mergeSort(int arr[], int start, int end) {
        // Base case
        if (start >= end) {
            return;
        }

        // Divide
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);      // Sort left half
        mergeSort(arr, mid + 1, end);    // Sort right half

        // Conquer (Merge)
        merge(arr, start, mid, end);
    }

    // Function to merge two sorted halves
    public static void merge(int arr[], int start, int mid, int end) {
        // Create a temporary array to store merged elements
        int temp[] = new int[end - start + 1];

        int i = start;   // Iterator for left part
        int j = mid + 1; // Iterator for right part
        int k = 0;       // Iterator for temp array

        // Merge the two halves into the temp array
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements of the left half (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of the right half (if any)
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted temp array back to the original array
        for (int m = 0 , n=start ; m < temp.length; m++ ,n++) {
            arr[n] = temp[m]; // Note: `start + m` to correctly copy into `arr`
        }
    }
}
 