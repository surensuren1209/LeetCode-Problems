class Solution {
    public int countHillValley(int[] nums) {
        int[] temp = new int[nums.length];
        int in = 0;
        temp[in++] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                temp[in++] = nums[i];
            }
        }
        int cnt = 0;
        for (int i = 1; i < in - 1; i++) {
            if ((temp[i] > temp[i - 1] && temp[i] > temp[i + 1]) ||
                (temp[i] < temp[i - 1] && temp[i] < temp[i + 1])) {
                cnt++;
            }
        }

        return cnt;
    }
}
