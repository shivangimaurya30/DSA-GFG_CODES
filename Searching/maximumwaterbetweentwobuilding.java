

//User function Template for Java

class Solution
{
    //Function to return the maximum water that can be stored.
    static int maxWater(int height[], int n) 
    { 
        //Your code here
        int left = 0, right = n - 1;
        int maxWater = 0;
        
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int water = (right - left - 1) * minHeight;
            maxWater = Math.max(maxWater, water);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    } 

}
