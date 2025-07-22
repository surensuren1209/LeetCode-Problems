import java.util.*;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, max = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            int val = nums[right];

            if (map.containsKey(val) && map.get(val) >= left) {
                int dupIndex = map.get(val);
                while (left <= dupIndex) {
                    sum -= nums[left];
                    left++;
                }
            }

            sum += val;
            map.put(val, right);
            max = Math.max(max, sum);
        }

        return max;
    }
}
