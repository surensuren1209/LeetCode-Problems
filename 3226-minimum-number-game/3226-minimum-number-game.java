class Solution {
    static{
        for(int i=0;i<500;i++){
            numberGame(new int[0]);
        }
    }
    public static int[] numberGame(int[] nums) {
        int n=nums.length;
        int [] arr = new int [n];
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2){
            arr[i] = nums[i+1];
            arr[i+1] = nums[i];
        }
        return arr;
    }
}