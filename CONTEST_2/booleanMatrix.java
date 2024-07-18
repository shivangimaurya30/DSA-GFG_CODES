//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int mat[][]=new int[901][901];
	   
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    for(int i=0;i<m;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            int x=sc.nextInt();
		            mat[i][j]=x;
		            
		        }
		    }
		    
		    Geeks.booleanMatrix(mat,m,n);
		    
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<m;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
                    sb.append(mat[i][j] + " ");
	            }
	            sb.append("\n");
	        }
	        
	        
	        System.out.print(sb);
	        
		    
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Geeks
{
    public static void booleanMatrix(int mat[][],int m,int n)
    {
        
        //Your code here
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    for (int k = 0; k < n; k++) {
                        mat[i][k] = 1;
                    }
                    break;
                }
            }
        }
    }
}