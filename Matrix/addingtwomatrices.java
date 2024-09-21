

//User function Template for Java

class Solution
{
    //Function to add two matrices.
    static int[][] sumMatrix(int A[][], int B[][])
    {
       // code here
        if(A.length != B.length || A[0].length != B[0].length)
            return new int[0][0];
        
        int[][] res = new int[A.length][A[0].length];
        
        for(int i = 0; i < A.length; i++)
            for(int j = 0; j < A[0].length; j++)
                res[i][j] = A[i][j] + B[i][j];
        
        return res;
    }
}
    
