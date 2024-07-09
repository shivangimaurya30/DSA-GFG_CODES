
class Solution
{
    // complete the function
    public static int digitalRoot(int n)
    {
        // add your code here
        if (n == 0) {
            return 0;
        }
        return 1 + (n - 1) % 9;
    }
}

