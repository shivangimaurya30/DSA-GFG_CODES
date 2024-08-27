

// User function Template for Java

class Solution {
    // Function to find minimum number of pages.
    public static long findPages(int n, int[] arr, int m) {
        // Your code here
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        if (m > n) {
            return -1;
        }
        
        long low = Arrays.stream(arr).max().getAsInt();
        long high = sum;
        
        long res = -1;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (canAllocate(arr, m, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return res;
    }
    
    private static boolean canAllocate(int[] arr, int m, long max) {
        int count = 1;
        long currSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            
            if (currSum > max) {
                count++;
                currSum = arr[i];
            }
        }
        
        return count <= m;
    }
}
