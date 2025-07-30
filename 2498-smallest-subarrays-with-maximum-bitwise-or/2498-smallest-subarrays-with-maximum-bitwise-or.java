class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] lastSeen = new int[32]; 

        for (int i = n - 1; i >= 0; i--) {
            for (int b = 0; b < 32; b++) {
                if (((nums[i] >> b) & 1) == 1) {
                    lastSeen[b] = i;
                }
            }

            int maxIndex = i;
            for (int b = 0; b < 32; b++) {
                if (lastSeen[b] > maxIndex) {
                    maxIndex = lastSeen[b];
                }
            }

            res[i] = maxIndex - i + 1;
        }

        return res;
    }
}
