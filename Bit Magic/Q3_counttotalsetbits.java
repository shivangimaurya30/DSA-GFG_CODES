//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends
//User function Template for Java

class Solution{
    public static int countSetBits(int n) {
        //WRITE YOUR CODE HERE!
        int count = 0;
        n++;
        for (int i = 1; i < n; i *= 2) {
            int completePairs = (n / (i * 2)) * i;
            int remainingBits = Math.max(0, n % (i * 2) - i);
            count += completePairs + remainingBits;
        }
        return count;
    }
}

//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}

// } Driver Code Ends