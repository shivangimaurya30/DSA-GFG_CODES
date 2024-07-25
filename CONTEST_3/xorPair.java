class Geeks
{
    public static boolean pairExists(int arr[], int n, int c)
    {
        //Your code h
        HashSet<Integer> set = new HashSet<>();
        
        boolean flag = false;
        
        for (int i = 0; i < n; i++) {
            if (set.contains(c ^ arr[i])) {
                flag = true;
                break;
            }
            set.add(arr[i]);
        }
        return flag;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int c = 6;
        boolean result = pairExists(arr, n, c);
        System.out.println("Pair exists: " + result);
    }
}
