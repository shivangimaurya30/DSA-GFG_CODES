

class Solution
{
    //Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][])
    {
        // code here 
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i < n / 2; i++)
        {
            int[] temp = matrix[i];
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = temp;
        }
    }
}
