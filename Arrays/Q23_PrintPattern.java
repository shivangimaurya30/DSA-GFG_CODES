class Solution{
    public List<Integer> pattern(int N){
        // code here
        
        List<Integer> result = new ArrayList<>();
        int current = N;
        
        while (current > 0) {
            result.add(current);
            current -= 5;
        }
        
        while (current < N) {
            result.add(current);
            current += 5;
        }
        
        if (current == N) {
            result.add(N);
        }
        
        return result;
    }
}
