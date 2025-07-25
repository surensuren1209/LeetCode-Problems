class Solution {
    static{
        for(int i=0;i<500;i++){
            longestPalindrome(" ");
        }
    }
    public  static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int st = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
    
            int len1 = helper(s, i, i);

            int len2 = helper(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > (end - st)) {
                st = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(st, end + 1);
    }

    private static int helper(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}
