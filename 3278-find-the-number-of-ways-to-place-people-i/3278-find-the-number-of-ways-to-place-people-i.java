import java.util.*;

public class Solution {

    public int numberOfPairs(int[][] points) {
        int ans = 0;
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];  
            }
            return a[0] - b[0];
            });
        for (int j = points.length - 1; j >= 0; j--) {
            int y = points[j][1];
            int mny = (int)1e9;
            for (int i = j - 1; i >= 0; i--) {
                int yy = points[i][1];
                if (yy >= mny || yy < y) {
                    continue;
                }
                ans++;
                mny = yy;
            }
        }

        return ans;
    }
}