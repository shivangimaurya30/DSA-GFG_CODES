


class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        // code here
         int[] rowSum = new int[N];
        int[] colSum = new int[N];

        // Calculate the row sums and column sums
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
            }
        }

        // Find the maximum sum among all row sums and column sums
        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            maxSum = Math.max(maxSum, rowSum[i]);
            maxSum = Math.max(maxSum, colSum[i]);
        }

        // Calculate the total number of operations needed
        int operations = 0;
        for (int i = 0; i < N; i++) {
            operations += maxSum - rowSum[i];
        }

        return operations;
    }
}
        
