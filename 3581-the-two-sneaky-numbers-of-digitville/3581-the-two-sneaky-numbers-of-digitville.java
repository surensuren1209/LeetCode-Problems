class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;        
        int[] freq = new int[n];      
        int[] result = new int[2];
        int idx = 0;

        for (int num : nums) {
            freq[num]++;
            if (freq[num] == 2) {
                result[idx++] = num;
                if (idx == 2) break;  
            }
        }
        return result;
    }
}
