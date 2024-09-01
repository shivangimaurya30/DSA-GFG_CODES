

//User function Template for Java

class Solution
{
    // A[], B[], C[]: input arrays
    //Function to merge three sorted lists into a single list.
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        // add ypur code here
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        int n = A.length, m = B.length, p = C.length;

        // Traverse all arrays and merge them in a sorted manner
        while (i < n || j < m || k < p) {
            int minVal = Integer.MAX_VALUE;
            
            // Find the smallest element among the current elements of A, B, and C
            if (i < n) {
                minVal = Math.min(minVal, A[i]);
            }
            if (j < m) {
                minVal = Math.min(minVal, B[j]);
            }
            if (k < p) {
                minVal = Math.min(minVal, C[k]);
            }
            
            // Add the smallest element to the merged list and move the corresponding pointer
            if (i < n && minVal == A[i]) {
                mergedList.add(A[i]);
                i++;
            } else if (j < m && minVal == B[j]) {
                mergedList.add(B[j]);
                j++;
            } else if (k < p && minVal == C[k]) {
                mergedList.add(C[k]);
                k++;
            }
        }

        return mergedList;
    
    }
}
