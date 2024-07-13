class Solution {
    // Function to find the maximum index difference.
    int maxIndexDiff(int[] arr) {
        // Your code here
       
        int n = arr.length;
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];
        
        // Fill leftMin[] such that leftMin[i] stores the minimum value from arr[0] to arr[i]
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        }
        
        // Fill rightMax[] such that rightMax[j] stores the maximum value from arr[j] to arr[n-1]
        rightMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(arr[j], rightMax[j + 1]);
        }
        
        // Traverse leftMin[] and rightMax[] to find the maximum j - i
        int i = 0, j = 0, maxDiff = -1;
        while (j < n && i < n) {
            if (leftMin[i] <= rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }
        
        return maxDiff;
    }
}
