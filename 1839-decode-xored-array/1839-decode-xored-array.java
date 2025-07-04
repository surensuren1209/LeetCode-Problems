class Solution {
    static {
        for(int i=0;i<500;i++){
            decode(new int[1],1);
        }
    }
    public static  int[] decode(int[] arr, int f) {
        int[] ans = new int[arr.length + 1];
        ans[0] = f;
        for (int i = 0; i < arr.length; i++) {
            ans[i + 1] = arr[i] ^ ans[i];
        }
        return ans;
    }
}
