class Solution
{
    boolean isLucky(int N)
    {
        int position = 2; 
        
        while (position <= N)
        {
            if (N % position == 0)
                return false; 
            N -= N / position; 
            position++; 
        }
        
        return true; 
    }
}