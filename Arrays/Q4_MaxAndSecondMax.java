class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
         int max1 = Integer.MIN_VALUE;
        int max2 = -1;
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            max2 = -1;
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(max1);
        result.add(max2);
        return result;
    }
}