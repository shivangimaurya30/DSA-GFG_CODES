class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
         int n = arr.length();
        int[] count = new int[26];
        
        for (int i = 0; i < n; i++) {
            count[arr.charAt(i) - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                sb.append((char) (i + 'a'));
            }
        }
        
        return sb.toString();
    }
}
