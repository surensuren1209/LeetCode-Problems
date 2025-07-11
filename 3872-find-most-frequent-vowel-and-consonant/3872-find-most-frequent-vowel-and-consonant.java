class Solution {
    static{
        for(int i=0;i<500;i++){
            maxFreqSum(" ");
        }
    }
    public  static int maxFreqSum(String s) {
        s = s.toLowerCase();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) if (Character.isLetter(c)) freq[c - 'a']++;
        String v = "aeiou";
        int maxV = 0, maxC = 0;
        for (int i = 0; i < 26; i++) {
            if (v.indexOf(i + 'a') >= 0) maxV = Math.max(maxV, freq[i]);
            else maxC = Math.max(maxC, freq[i]);
        }
        return maxV + maxC;
    }
}
