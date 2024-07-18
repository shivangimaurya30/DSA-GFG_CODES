//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		
		while(testcases-->0)
		{
		    int n=sc.nextInt();
		    
		    Geeks obj=new Geeks();
		    System.out.println(obj.toggleTheMiddle(n));
		}
	}
}

// } Driver Code Ends

//User function Template for Java

class Geeks
{
    public int toggleTheMiddle(int n)
    {
        //Your code here
        String binary = Integer.toBinaryString(n);
        char[] arr = binary.toCharArray();
        
        if (arr.length % 2 == 0) {
            int mid = arr.length / 2;
            arr[mid - 1] = arr[mid - 1] == '0' ? '1' : '0';
            arr[mid] = arr[mid] == '0' ? '1' : '0';
        } else {
            int mid = arr.length / 2;
            arr[mid] = arr[mid] == '0' ? '1' : '0';
        }
        
        binary = new String(arr);
        return Integer.parseInt(binary, 2);
    }
}