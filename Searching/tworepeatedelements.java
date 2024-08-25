

// User function template for JAVA

class Solution {
    // Function to find two repeated elements.
    public int[] twoRepeated(int n, int arr[]) {
        // Your code here
        int[] res = new int[2];
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int absVal = Math.abs(arr[i]);
            if (arr[absVal - 1] < 0) {
                res[count++] = absVal;
            } else {
                arr[absVal - 1] = -arr[absVal - 1];
            }
        }
        
        return res;
    }
}
