import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck == null || deck.length < 2)
            return false;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int card : deck) {
            freq.put(card, freq.getOrDefault(card, 0) + 1);
        }

        int gcd = -1;
        for (int count : freq.values()) {
            if (gcd == -1) {
                gcd = count;
            } else {
                gcd = helper(gcd, count);
            }
        }
        return gcd >= 2;
    }

    private int helper(int a, int b) {
        if (b == 0)
            return a;
        return helper(b, a % b);
    }
}
