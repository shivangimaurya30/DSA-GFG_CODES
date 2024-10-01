

//User function Template for Java

class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
         int upperSum = 0, lowerSum = 0;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i <= j)
                    upperSum += matrix[i][j];
                if(i >= j)
                    lowerSum += matrix[i][j];
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(upperSum);
        ans.add(lowerSum);
        
        return ans;
    }
}
