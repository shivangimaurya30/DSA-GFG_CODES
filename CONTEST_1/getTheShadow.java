//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    static int a[] = new int[1000001];
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            for(int i = 0; i < n; i++)
              a[i]=  sc.nextInt();
            Solution sol=new Solution();
            int res[]=sol.solve(n,a);
            System.out.println(res[0]+" "+res[1]);
        }
    }
    
}

// } Driver Code Ends
//User function Template for Java
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

//{ Driver Code Starts.

// } Driver Code Ends