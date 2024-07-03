
class Solution {
    long power(int N, int R) {
        int MOD = 1000000007;
        return powerMod(N, R, MOD);
    }

    long powerMod(long base, long exp, int mod) {
        if (exp == 0) {
            return 1;
        }

        long halfPower = powerMod(base, exp / 2, mod);
        long halfPowerSquared = (halfPower * halfPower) % mod;

        if (exp % 2 != 0) {
            halfPowerSquared = (halfPowerSquared * base) % mod;
        }

        return halfPowerSquared;
    }
}
