class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int rev = 26 - (s.charAt(i) - 'a');
            ans += rev * (i + 1);
        }
        return ans;
    }
}
