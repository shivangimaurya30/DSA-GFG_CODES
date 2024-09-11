class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        
        
        /**************
        * No need to print the array
        * ************/
        int nextZero = 0;
        
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                swap(A, nextZero, i);
                nextZero++;
            }
        }
    }
    
    static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

