
class Solution{
    public static int maxConsecutiveOnes(int N) {
        
        // Your code here
        int maxCount = 0;
        int currentCount = 0;

        while (N != 0) {
            // Check the last bit of N
            if ((N & 1) == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
            N = N >> 1;
        }

        return maxCount;
    }
}
