class Solution
{
    // complete the function
    public static int sumOfDigits(int n)
    {
        // add your code here
        if(n==0)
        return n;
        return sumOfDigits(n/10)+n%10;
        }
}

