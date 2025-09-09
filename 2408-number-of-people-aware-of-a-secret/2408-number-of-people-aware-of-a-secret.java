class Solution {
    public int peopleAwareOfSecret(int n, int d, int f) {
        int m = 1000000007;
        long[] arr = new long[n + 1]; 
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = i - f + 1; j <= i - d; j++) {
                if (j >= 1) {
                    arr[i] = (arr[i] + arr[j]) % m;
                }
            }
        }

        long ans = 0;
        for (int i = n - f + 1; i <= n; i++) {
            if (i >= 1) ans = (ans + arr[i]) % m;
        }
        return (int) ans;
    }
}
