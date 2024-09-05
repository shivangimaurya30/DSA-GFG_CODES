

// User function Template for Java

class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        // Your Code Here
        return mergeSort(arr, 0, n - 1);
    }

    static long mergeSort(long arr[], int l, int r) {
        long inversions = 0;
        if (l < r) {
            int m = (l + r) / 2;
            inversions += mergeSort(arr, l, m);
            inversions += mergeSort(arr, m + 1, r);
            inversions += merge(arr, l, m, r);
        }
        return inversions;
    }

    static long merge(long arr[], int l, int m, int r) {
        long inversions = 0;
        long n1 = m - l + 1, n2 = r - m;
        long L[] = new long[(int) n1];
        long R[] = new long[(int) n2];

        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                inversions += n1 - i;
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        return inversions;
    
    }
}
