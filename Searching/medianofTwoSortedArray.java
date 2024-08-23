

//User function Template for Java

class Solution
{
    //Function to find the median of the two arrays when they get merged.
    public static int findMedian(int arr[], int n, int brr[], int m)
    {
        //Your code here
        if (n > m) {
            return findMedian(brr, m, arr, n);
        }
        
        int low = 0, high = n;
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (n + m + 1) / 2 - partitionX;
            
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : arr[partitionX - 1];
            int minRightX = (partitionX == n) ? Integer.MAX_VALUE : arr[partitionX];
            
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : brr[partitionY - 1];
            int minRightY = (partitionY == m) ? Integer.MAX_VALUE : brr[partitionY];
            
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        
        return -1;
    }
}
