



class Solution
{
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int matrix[][], int n)
    {
        // code here 
        return findDet(matrix, n);
    }
    
    static int findDet(int matrix[][], int n)
    {
        int det = 0;
        
        if(n == 1)
            return matrix[0][0];
        
        if(n == 2)
            return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
        
        for(int i = 0; i < n; i++)
        {
            int temp[][] = new int[n-1][n-1];
            
            for(int j = 1; j < n; j++)
            {
                for(int k = 0, col = 0; k < n; k++)
                {
                    if(k != i)
                    {
                        temp[j-1][col] = matrix[j][k];
                        col++;
                    }
                }
            }
            
            det += Math.pow(-1, i) * matrix[0][i] * findDet(temp, n-1);
        }
        
        return det;
    }
}
