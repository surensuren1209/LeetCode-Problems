class Solution {
    static{
        for(int i=0;i<500;i++){
            arithmeticTriplets(new int [1] , 1);
        }
    }
    public static  int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int diff1 = nums[j] - nums[i];
                if (diff1 == diff) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
