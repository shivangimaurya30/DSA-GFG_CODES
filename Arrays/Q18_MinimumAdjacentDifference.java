class Solution{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        
        // Your code here
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - arr[(i + 1) % n]);
            
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        
        return minDiff;
    }
}
