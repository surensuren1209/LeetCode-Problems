class Solution {
    public char repeatedCharacter(String s) {
        boolean[] result = new boolean[26];
        
        for (char c : s.toCharArray()) {
            if (result[c - 'a']) {
                return c;
            }
            result[c - 'a'] = true;
        }
        
        return ' '; 
    }
}
