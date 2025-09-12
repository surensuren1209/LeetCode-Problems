class Solution {
    public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (helper(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean helper(char c) {
     
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
