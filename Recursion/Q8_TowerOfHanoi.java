class Hanoi {

    public long toh(int n, int from, int to, int aux) {
        // Your code here
         if (n == 0) {
            return 0;
        }
        
        long moves = 0;

        if (n == 1) {
            System.out.println("move disk 1 from rod " + from + " to rod " + to);
            return 1;
        }

        moves += toh(n - 1, from, aux, to);

       
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        moves++;

       
        moves += toh(n - 1, aux, to, from);

        return moves;
    }
}
