class Solution{    
    
    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
        int countDecreasingBreaks = 0;
        for (int i = 1; i < num; i++) {
            if (arr[i] < arr[i - 1]) {
                countDecreasingBreaks++;
            }
        }
        if (arr[num - 1] > arr[0]) {
            countDecreasingBreaks++;
        }
        
        // Check for non-increasing order
        int countIncreasingBreaks = 0;
        for (int i = 1; i < num; i++) {
            if (arr[i] > arr[i - 1]) {
                countIncreasingBreaks++;
            }
        }
        if (arr[num - 1] < arr[0]) {
            countIncreasingBreaks++;
        }
        
        // Array should have exactly one break point for a valid rotation
        if (countDecreasingBreaks == 1 || countIncreasingBreaks == 1) {
            return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 1, 2};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 3, 2, 1};
        int[] arr4 = {2, 1, 4, 3};

        System.out.println(checkRotatedAndSorted(arr1, arr1.length) ? "Yes" : "No"); 
    }
    
}