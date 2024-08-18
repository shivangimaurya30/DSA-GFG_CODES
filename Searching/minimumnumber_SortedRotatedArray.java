class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        if (high < low) return arr[0];
        
        if (high == low) return arr[low];
        
        int mid = low + (high - low)/2;
        
        if (mid < high && arr[mid+1] < arr[mid]) return arr[mid+1];
        
        if (mid > low && arr[mid] < arr[mid - 1]) return arr[mid];
        
        if (arr[low] <= arr[mid]) {
            if (arr[low] <= arr[high]) return arr[low];
            else return minNumber(arr, mid+1, high);
        }
        
        return minNumber(arr, low, mid);
    }
}
