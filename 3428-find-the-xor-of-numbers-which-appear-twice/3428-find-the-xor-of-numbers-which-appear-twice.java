class Solution {
    static{
        for(int i=0;i<500;i++){
            duplicateNumbersXOR(new int[1]);
        }
    }
    public  static int duplicateNumbersXOR(int[] nums) {
        int[] freq = new int[101];
        for (int n : nums) freq[n]++;
        int ans = 0;
        for (int i = 1; i <= 100; i++) {
            if (freq[i] == 2) ans ^= i;
        }
        return ans;
    }
}
