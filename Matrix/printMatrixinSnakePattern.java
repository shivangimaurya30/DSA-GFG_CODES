

//User function Template for Java

class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // For even index rows, traverse left to right
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    result.add(matrix[i][j]);
                }
            } 
            // For odd index rows, traverse right to left
            else {
                for (int j = n - 1; j >= 0; j--) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int matrix1[][] = {
            {45, 48, 54},
            {21, 89, 87},
            {70, 78, 15}
        };
        
        int matrix2[][] = {
            {1, 2},
            {3, 4}
        };

        System.out.println(snakePattern(matrix1)); 
        System.out.println(snakePattern(matrix2)); 
    }
}
