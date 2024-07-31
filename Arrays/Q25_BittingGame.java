class Solution
{
    static int betBalance(String result)
    {
        // code here
        int N = result.length();
        int balance = 4;
        int bet = 1;

        for (int i = 0; i < N; i++) {
            if (result.charAt(i) == 'W') {
                balance += bet;
                bet = 1;
            } else {
                balance -= bet;
                bet *= 2;
            }
            if (balance < bet && i < N - 1) {
                balance = -1;
                break;
            }
        }
        return balance;

    }
}