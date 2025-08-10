class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = helper(n);
        for (int i = 0; i < 31; i++) {
            int pow = 1 << i; // 2^i
            if (helper(pow).equals(target)) {
                return true;
            }
        }
        return false;
    }
    private String helper(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
}
  