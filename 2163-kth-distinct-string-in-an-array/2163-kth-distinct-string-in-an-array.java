import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        int cnt = 0;
        for (String s : arr) {
            if (freq.get(s) == 1) {
                cnt++;
                if (cnt == k) {
                    return s;
                }
            }
        }
        return ""; 
    }
}
