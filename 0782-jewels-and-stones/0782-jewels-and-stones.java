class Solution {
    public int numJewelsInStones(String j, String s) {
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (j.indexOf(ch) != -1) {
                cnt++;
            }
        }
        return cnt;
    }
}
