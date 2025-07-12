class Solution {
    public boolean equalFrequency(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        for (int i = 0; i < 26; i++) {
            if (freq[i]-- > 0) {
                Set<Integer> set = new HashSet<>();
                for (int f : freq) if (f > 0) set.add(f);
                if (set.size() == 1) return true;
                freq[i]++;
            }
        }
        return false;
    }
}
