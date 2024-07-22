class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        int i = 0;
        while (i < n - 1) {
            while ((i < n - 1) && (A[i + 1] <= A[i])) {
                i++;
            }
            if (i == n - 1) {
                break;
            }
            
            int buy = i++;
            
            while ((i < n) && (A[i] >= A[i - 1])) {
                i++;
            }
            
            int sell = i - 1;
            
            ArrayList<Integer> transaction = new ArrayList<>();
            transaction.add(buy);
            transaction.add(sell);
            result.add(transaction);
        }
        
        return result;
    
    }
}
