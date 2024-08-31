

//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i = n - 1; // Last element of arr1
        int j = 0; // First element of arr2
        
        // Compare and swap elements
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                // Swap arr1[i] and arr2[j]
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            } else {
                break; // Arrays are already in correct order
            }
        }
        
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    }
