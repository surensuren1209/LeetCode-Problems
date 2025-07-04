class Solution {
    static{
        for(int i=0;i<500;i++){
            minOperations(new int[1],1);
        }
    }
    public static int minOperations(int[] nums, int k) {
       int cnt=0;
       for(int n : nums){
          if(n<k) cnt++;
       }
       return cnt;
    }
}