class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        double min = Double.MAX_VALUE;

        while (i < j) {
            double avg = (nums[i] + nums[j]) / 2.0;
            min = Math.min(min, avg);
            i++;
            j--;
        }

        return min;
    }
}
