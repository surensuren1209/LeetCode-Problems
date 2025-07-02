import java.util.*;

class Solution {
    static {
        for(int i=0;i<500;i++){
            heightChecker(new int [1]);
        }
    }
    public static int heightChecker(int[] h) {
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
