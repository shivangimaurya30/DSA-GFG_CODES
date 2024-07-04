class Solution
{
    static int fibonacci(int n)
    {
        // your code here
        if (n == 1 || n == 2) {
            return 1;
        }
        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
       
    }
}