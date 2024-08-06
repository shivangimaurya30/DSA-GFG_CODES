class LeftIndex{ 

    static int leftIndex(int N, int arr[], int X)
    {
       
       // Your code here
       
        int low = 0, high = N - 1;
        int result = -1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == X) {
                result = mid;
                high = mid - 1;
            } else if(arr[mid] < X) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }
}
   

