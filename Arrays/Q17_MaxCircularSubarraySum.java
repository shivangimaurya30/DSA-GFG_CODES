class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        int maxKadane = kadane(a, n);
        
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += a[i];
        }
        
        int minKadane = kadaneInverted(a, n);
        
        int maxCircular = totalSum - minKadane;
        
        if (maxCircular == 0) {
            return maxKadane;
        }
        
        return Math.max(maxKadane, maxCircular);
    }
    
    static int kadane(int a[], int n) {
        int maxEndingHere = a[0], maxSoFar = a[0];
        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(a[i], maxEndingHere + a[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    
    static int kadaneInverted(int a[], int n) {
        int minEndingHere = a[0], minSoFar = a[0];
        for (int i = 1; i < n; i++) {
            minEndingHere = Math.min(a[i], minEndingHere + a[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }
        return minSoFar;
    }
}
