import java.util.*;

class Solution {
    public int heightChecker(int[] h) {
        int cnt = 0;
        
        int[] arr = Arrays.copyOf(h, h.length);
        Arrays.sort(arr);
        
        for (int i = 0; i < h.length; i++) {
            if (h[i] != arr[i]) {
                cnt++;
            }
        }
        
        return cnt;
    }
}
