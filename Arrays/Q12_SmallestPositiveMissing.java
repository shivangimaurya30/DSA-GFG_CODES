class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        
        for (int i = 0; i < size; i++) {
            while (arr[i] > 0 && arr[i] <= size && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        
        // Step 2: Find the first index where arr[i] != i + 1
        for (int i = 0; i < size; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        
        // If all elements are in place, the missing number is size + 1
        return size + 1;
    }
}
