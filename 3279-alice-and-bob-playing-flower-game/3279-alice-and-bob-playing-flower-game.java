class Solution {
    public long flowerGame(int n, int m) {
        long o1 = n / 2 + n % 2;
        long e1 = n / 2;
        long o2 = m / 2 + m % 2;
        long e2 = m / 2;
        return o1 * e2 + e1 * o2; 
    }
}