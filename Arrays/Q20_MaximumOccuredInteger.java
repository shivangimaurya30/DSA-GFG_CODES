class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int[] diff = new int[maxx + 2];
        
        for (int i = 0; i < n; i++) {
            diff[l[i]] += 1;
            diff[r[i] + 1] -= 1;
        }
       
        int maxCount = 0;
        int maxOccurInt = 0;
        int currentCount = 0;
        for (int i = 0; i <= maxx; i++) {
            currentCount += diff[i];
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxOccurInt = i;
            }
        }
        
        return maxOccurInt;
    }
}
