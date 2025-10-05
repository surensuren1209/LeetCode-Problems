class Solution {
    public boolean canChoose(int[][] arr, int[] nums) 
    {
        int r=0;
        for(int i=0;i<nums.length;i++)
        {
            int j=i;
            int c=0;
            while(c<arr[r].length && j<nums.length && arr[r][c]==nums[j])
            {
                c++;
                j++;
            }
            
            if(c==arr[r].length)
            {
                r++;
                i=j-1;
            }
            
            if(r==arr.length)
            {
                return true;
            }
        }
        return false;
    }
}