class Solution {
    private static final int MOD = 1_000_000_007;

    public int[] productQueries(int n, int[][] queries) {
       
        List<Long> powers = new ArrayList<>();
        long power = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                powers.add(power);
            }
            power <<= 1;
            n >>= 1;
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            long prod = 1;
            for (int j = left; j <= right; j++) {
                prod = (prod * powers.get(j)) % MOD;
            }
            result[i] = (int) prod;
        }

        return result;
    }
}
