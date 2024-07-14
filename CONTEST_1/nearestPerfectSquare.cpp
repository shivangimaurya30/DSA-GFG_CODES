//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    long long nearestPerfectSquare(long long n) {
        // code here
    long long int ab_no = ceil(sqrt(n+1)) * ceil(sqrt(n+1));
	long long int b_no = floor(sqrt(n-1)) * floor(sqrt(n-1));
	
	long long int d1 = n - ab_no;
	long long int d2 = b_no - n;
	
	if(d1 == d2){
		return b_no;
	}else if(d1 > d2){
		return ab_no;
	}else{
		return b_no;
	}
    }
};


//{ Driver Code Starts.

int main(){
    int t;
    scanf("%d ",&t);
    while(t--){
        
        long long n;
        scanf("%lld",&n);
        
        Solution obj;
        long long res = obj.nearestPerfectSquare(n);
        
        cout<<res<<endl;
        
    }
}

// } Driver Code Ends