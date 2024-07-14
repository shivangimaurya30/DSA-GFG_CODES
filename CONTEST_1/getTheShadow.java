class Solution
{
    public int[] solve(int N, int a[])
     {
        // code here
        long sumN = (long)N * (N + 1) / 2;
        long sumNSq = (long)N * (N + 1) * (2 * N + 1) / 6;
        long sumA = 0, sumASq = 0;
        for(int i = 0; i < N; i++){
            sumA += a[i];
            sumASq += (long)a[i]*a[i];
        }
        
        long diff = sumN - sumA;
        long diffSq = sumNSq - sumASq;
        
        long sum = diffSq/diff;
        
        int missing = (int)((diff+sum) / 2);
        int repeating = (int)(sum - missing);
        
        return new int[]{repeating, missing};
     }
}
