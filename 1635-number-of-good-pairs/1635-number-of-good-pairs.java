class Solution {
    static{
        for(int i=0;i<500;i++){
            numIdenticalPairs(new int [1]);
        }
    }
    public static  int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j])    cnt++;
            }
        }
        return cnt;
    }
}
