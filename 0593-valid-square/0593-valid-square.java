import java.util.*;

class Solution {

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        
        int[][] points = { p1, p2, p3, p4 };

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                int d = helper(points[i], points[j]);
                if (d == 0)
                    return false; 
                set.add(d);
            }
        }
        if (set.size() != 2)
            return false;
        int min = Collections.min(set);
        int max = Collections.max(set);

        return max == 2 * min;
    }

    private int helper(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }
}
