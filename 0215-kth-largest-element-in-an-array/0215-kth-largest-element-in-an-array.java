import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> result = new PriorityQueue<>();

        for (int num : nums) {
            result.offer(num);
            if (result.size() > k) {
                result.poll(); 
            }
        }

        return result.peek(); 
    }
}
