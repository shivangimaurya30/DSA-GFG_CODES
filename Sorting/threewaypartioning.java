

//User function Template for Java

class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int low = 0, mid = 0, high = array.length - 1;

        while (mid <= high) {
            if (array[mid] < a) {
                swap(array, low++, mid++);
            } else if (array[mid] > b) {
                swap(array, mid, high--);
            } else {
                mid++;
            }
        }
    }

    private void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
}
