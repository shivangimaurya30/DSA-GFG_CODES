//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    static long arr[] = new long[1000001];
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
              
            System.out.println(Geeks.FindMaxSum(arr,n));
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Geeks
{
   public static long FindMaxSum(long arr[], int n)
    {
       //Your code here
       if (n == 1) {
            return arr[0];
        }
        long[] dp = new long[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }
        return dp[n - 1];
    }
}