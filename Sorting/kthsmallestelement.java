

class Solution
{
    //Function to find the kth smallest element in the array.
    public static int kthSmallest(int arr[], int n, int k)
    {
        // Your code here
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
