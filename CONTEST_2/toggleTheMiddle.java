class Geeks
{
    public int toggleTheMiddle(int n)
    {
        //Your code here
        String binary = Integer.toBinaryString(n);
        char[] arr = binary.toCharArray();
        
        if (arr.length % 2 == 0) {
            int mid = arr.length / 2;
            arr[mid - 1] = arr[mid - 1] == '0' ? '1' : '0';
            arr[mid] = arr[mid] == '0' ? '1' : '0';
        } else {
            int mid = arr.length / 2;
            arr[mid] = arr[mid] == '0' ? '1' : '0';
        }
        
        binary = new String(arr);
        return Integer.parseInt(binary, 2);
    }
}
