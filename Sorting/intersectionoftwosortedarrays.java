

//User function Template for Java

class Solution
{
    //Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        // add your code here
        ArrayList<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            // Skip duplicates in arr1
            while (i > 0 && i < n && arr1[i] == arr1[i - 1]) {
                i++;
            }
            // Skip duplicates in arr2
            while (j > 0 && j < m && arr2[j] == arr2[j - 1]) {
                j++;
            }

            if (i < n && j < m) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    j++;
                } else {
                    // Both elements are the same
                    intersection.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }

        // If no common elements, add -1
        if (intersection.isEmpty()) {
            intersection.add(-1);
        }

        return intersection;
    }

}
