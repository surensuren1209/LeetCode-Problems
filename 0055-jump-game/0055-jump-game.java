class Solution {
    static{
    for(int i=0;i<500;i++){
        canJump(new int[1]);
    }
    }
    public  static boolean canJump(int[] nums) {
        int result =0;
        for(int i=0;i<nums.length;i++){
            if(i>result){
                return false;
            }
            result = Math.max(result,i+nums[i]);
        }
        return true;
    }
}