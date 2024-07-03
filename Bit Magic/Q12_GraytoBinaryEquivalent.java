class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
         int result = n;
        while (n > 0) {
            n >>= 1;
            result = result ^ n;
        }
        return result;
        
    }
       
}
