class Solution {
    static{
        for(int i=0;i<500;i++){
            findDuplicate(new int[1]);
        }
    }
    public  static int findDuplicate(int[] nums) {
        int n = nums.length;
        int frqe [] = new int[n];
        for(int i=0;i<n;i++){
            frqe[nums[i]]++;
        }
        for(int i=0;i<n;i++){
            if(frqe[i]>1) return i;
        }
        return 0;
    }
}