class Solution {
    public int maxDifference(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }

        int maxOdd = 0;
        int minEven = s.length();

        for (int freq : cnt) {
            if (freq == 0) continue;

            if ((freq & 1) == 1) {
                maxOdd = Math.max(maxOdd, freq);
            } else {
                minEven = Math.min(minEven, freq);
            }
        }

        return maxOdd - minEven;
    }
}
