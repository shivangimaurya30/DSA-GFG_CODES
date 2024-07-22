class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] - 1;
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] % P < N) {
                arr[arr[i] % P] = arr[arr[i] % P] + P;
            }
        }
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / P;
        }
        
    }
}
