

class Solution{

    //Function to insert elements of array in the hashTable avoiding collisions.
    public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)
    {
        //Your code here
        ArrayList<ArrayList<Integer>> hashTable = new ArrayList<>();
        for(int i = 0; i < hashSize; i++){
            hashTable.add(new ArrayList<>());
        }
        
        for(int i = 0; i < n; i++){
            int index = arr[i] % hashSize;
            hashTable.get(index).add(arr[i]);
        }
        
        return hashTable;
    }
}
