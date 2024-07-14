//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++


long long minOperations(long long n)
{
    //Your code here
        if(n == 1){
		return 0;
	}
	
	else if(n%2 == 0){
		return 1 + minOperations(n/2);
	}else{
		return 1 + min(minOperations(n-1),minOperations(n+1));
	}

}

//{ Driver Code Starts.



int main() {
    int testcases;
    cin>>testcases;
    while(testcases--)
    {
        long long n;
        cin>>n;
        cout<<minOperations(n)<<endl;
        
        
    }
	return 0;
}
// } Driver Code Ends