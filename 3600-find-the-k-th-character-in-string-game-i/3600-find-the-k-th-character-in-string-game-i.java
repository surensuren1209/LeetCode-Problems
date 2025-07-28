class Solution {
    static{
        for(int i=0;i<500;i++){
            kthCharacter(1);
        }
    }
    public  static char kthCharacter(int k) {
        String s = "a";
        
        while (s.length() <= k) {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                char next = (char) ((c - 'a' + 1) % 26 + 'a');
                ans.append(next);
            }
            s += ans.toString();
        }
        
        return s.charAt(k-1);
    }
}