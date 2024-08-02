class StrongestNeighbour{
    
    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
         StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < sizeOfArray - 1; i++){
            sb.append(Math.max(arr[i], arr[i+1]) + " ");
        }
        
        System.out.print(sb.toString().trim());
         
        
    }
}
