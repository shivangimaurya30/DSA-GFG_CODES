class Solution
{
    public int[]  LargestFraction(int n, int d)
    {
        // code here
         int bestNumerator = 0;
        int bestDenominator = 1;
        
        // Iterate over possible denominators
        for (int denominator = 1; denominator <= 10000; denominator++) {
            // Calculate the numerator such that the fraction is just less than n/d
            int numerator = (n * denominator - 1) / d;
            
            // Ensure the fraction is less than n/d and gcd condition
            if (numerator * d < n * denominator && gcd(numerator, denominator) == 1) {
                // Update if this fraction is larger than the best found so far
                if ((long)numerator * bestDenominator > (long)bestNumerator * denominator) {
                    bestNumerator = numerator;
                    bestDenominator = denominator;
                }
            }
        }
        
        return new int[]{bestNumerator, bestDenominator};
    }
     private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}