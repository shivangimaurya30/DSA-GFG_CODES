

class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        
        while(top <= bottom && left <= right) {
            // Print from left to right
            for(int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            
            // Print from top to bottom
            for(int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            
            // Print from right to left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // Print from bottom to top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return ans;
    }
}
