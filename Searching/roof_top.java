


class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        // Your code here
       
        int maxSteps = 0, currentSteps = 0;
        
        for (int i = 1; i < N; i++) {
            if (A[i] > A[i - 1]) {
                currentSteps++;
                maxSteps = Math.max(maxSteps, currentSteps);
            } else {
                currentSteps = 0;
            }
        }
        
        return maxSteps;
    }
    
}
