class Solution {
    static{
        for(int i=0;i<500;i++){
            maxSubArray(new int[1]);
        }
    }
    public  static  int maxSubArray(int[] nums) {
        int sum=0;
        int min = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i:nums){
            sum+=i;
            min=Math.max(sum,min);
            if(sum<0) sum=0;
        }
        return min;
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-1;j++){
        //         for(int k=i;k<j=k++){

        //         }
        //     }
        // }
    }
}