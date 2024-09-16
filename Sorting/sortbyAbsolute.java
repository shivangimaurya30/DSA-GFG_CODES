

//User function Template for Java

class Solution
{
    //Function to sort the array according to difference with given number.
    static void sortABS(List<Integer> arr, int n, int k)  
    {
        // add your code here
        arr.sort((a, b) -> Math.abs(a - k) - Math.abs(b - k));
    }
}
