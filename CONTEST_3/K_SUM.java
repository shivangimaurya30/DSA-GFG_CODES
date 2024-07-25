class Geeks
{
    public static long kSum(int arr[], int n, int k)
    {
       //Your code here
       Arrays.sort(arr);
        
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {4, 2, 9, 1, 5, 3, 6, 8, 7};
        int n = arr.length;
        int k = 3;
        long result = kSum(arr, n, k);
        System.out.println("Sum of " + k + " smallest elements: " + result);
    }
}
