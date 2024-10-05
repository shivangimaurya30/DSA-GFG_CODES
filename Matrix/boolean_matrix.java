

//User function Template for Java

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int r = matrix.length;
        int c = matrix[0].length;
        
        int[] rows = new int[r];
        int[] cols = new int[c];
        
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(matrix[i][j] == 1)
                {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(rows[i] == 1 || cols[j] == 1)
                {
                    matrix[i][j] = 1;
                }
            }
        }
    }
}
