class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                countX++;
            } else if (arr[i] == y) {
                countY++;
            }
        }
        if (countX > countY) {
            return x;
        } else if (countY > countX) {
            return y;
        } else {
            
            return Math.min(x, y);
        }
    }
}
