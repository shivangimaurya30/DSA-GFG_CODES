

//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> res = new ArrayList<>();
        
        // Traverse the first row
        for(int i = 0; i < m; i++)
            res.add(matrix[0][i]);
        
        // Traverse the last column
        for(int i = 1; i < n - 1; i++)
            res.add(matrix[i][m - 1]);
        
        // Traverse the last row
        if(n > 1)
            for(int i = m - 1; i >= 0; i--)
                res.add(matrix[n - 1][i]);
        
        // Traverse the first column
        if(m > 1)
            for(int i = n - 2; i > 0; i--)
                res.add(matrix[i][0]);
        
        return res;
    }
}
