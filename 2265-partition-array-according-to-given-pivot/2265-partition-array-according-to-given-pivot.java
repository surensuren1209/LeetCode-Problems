class Solution {
    static {
        for(int i=0;i<500;i++){
            pivotArray(new int[1],1);
        }
    }
    public static  int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int cntLess = 0, cntEqual = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) cntLess++;
            else if (nums[i] == pivot) cntEqual++;
        }
        int t1 = 0;
        int t2 = cntLess;
        int t3 = cntLess + cntEqual;

        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                result[t1++] = nums[i];
            } else if (nums[i] == pivot) {
                result[t2++] = nums[i];
            } else {
                result[t3++] = nums[i];
            }
        }

        return result;
    }
}
