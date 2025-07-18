import java.util.*;

class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length / 3;
        long[] prefix = new long[nums.length];
        Arrays.fill(prefix, -1);
        long[] suffix = new long[nums.length];
        Arrays.fill(suffix, -1);

        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        
       
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            pq.add((long) nums[i]);

            if (pq.size() > n) {
                sum -= pq.poll();
            }
            if (pq.size() == n) {
                prefix[i] = sum;
            }
        }

        PriorityQueue<Long> pq2 = new PriorityQueue<>();
        sum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            pq2.add((long) nums[i]);

            if (pq2.size() > n) {
                sum -= pq2.poll();
            }
            if (pq2.size() == n) {
                suffix[i] = sum;
            }
        }
        long ans = Long.MAX_VALUE;
        for (int i = n - 1; i < 2 * n; i++) {
            ans = Math.min(ans, prefix[i] - suffix[i + 1]);
        }

        return ans;
    }
}