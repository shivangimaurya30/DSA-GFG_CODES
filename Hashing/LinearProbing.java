

class Solution{
    //Function to fill the array elements into a hash table 
    //using Linear Probing to handle collisions.
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        //Your code here
        int[] hash_table = new int[hash_size];
        for (int i = 0; i < hash_size; i++) {
            hash_table[i] = -1;
        }
        
        for (int i = 0; i < sizeOfArray; i++) {
            int key = arr[i] % hash_size;
            
            if (hash_table[key] == -1 || hash_table[key] == arr[i]) {
                hash_table[key] = arr[i];
            } else {
                int j = key;
                boolean inserted = false;
                
                do {
                    j = (j + 1) % hash_size;
                    
                    if (hash_table[j] == -1 || hash_table[j] == arr[i]) {
                        hash_table[j] = arr[i];
                        inserted = true;
                        break;
                    }
                } while (j != key);
                
                // If we couldn't insert, just drop the element
            }
        }
        
        return hash_table;
    }
}
