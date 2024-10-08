

//User function Template for Java

class Solution
{
    //Function to multiply two matrices.
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        // code here 
        if(A[0].length != B.length)
            return new int[0][0];
        
        int[][] res = new int[A.length][B[0].length];
        
        for(int i = 0; i < A.length; i++)
            for(int j = 0; j < B[0].length; j++)
                for(int k = 0; k < B.length; k++)
                    res[i][j] += A[i][k] * B[k][j];
        
        return res;
    }
}
