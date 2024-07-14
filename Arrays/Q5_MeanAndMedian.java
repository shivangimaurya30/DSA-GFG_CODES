class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       
       //Your code here
       //If median is fraction then conver it to integer and return
       if (N % 2 != 0) {
      return A[N / 2];
    } else {
      int mid1 = A[N / 2 - 1];
      int mid2 = A[N / 2];
      return (mid1 + mid2) / 2;
    }
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       //Your code here
       int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += A[i];
    }
    return sum / N;
    }

}

