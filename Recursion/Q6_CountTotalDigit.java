
class Solution
{
    // complete the below function
    public static int countDigits(int n)
    {
        // add your code here
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
}

