

//User function Template for Java

class Solution
{
  
    // n: size of array
    // x: element to find
    //Function to find index of element x in the array if it is present.
    static long closer(int arr[], int n, long x)
    {
        // add your code here
         int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (mid - 1 >= 0 && arr[mid - 1] == x) {
                return mid - 1;
            } else if (mid + 1 < n && arr[mid + 1] == x) {
                return mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 2;
            } else {
                high = mid - 2;
            }
        }
        return -1;
    }
}
