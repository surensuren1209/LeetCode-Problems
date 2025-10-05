import java.util.*;

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            dfs(heights, pacific, i, 0, -1);
            dfs(heights, atlantic, i, n - 1, -1);
        }
        for (int j = 0; j < n; j++) {
            dfs(heights, pacific, 0, j, -1);
            dfs(heights, atlantic, m - 1, j, -1);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j])
                    res.add(Arrays.asList(i, j));
            }
        }
        return res;
    }

    void dfs(int[][] h, boolean[][] seen, int i, int j, int prev) {
        if (i < 0 || j < 0 || i >= h.length || j >= h[0].length || seen[i][j] || h[i][j] < prev)
            return;
        seen[i][j] = true;
        dfs(h, seen, i + 1, j, h[i][j]);
        dfs(h, seen, i - 1, j, h[i][j]);
        dfs(h, seen, i, j + 1, h[i][j]);
        dfs(h, seen, i, j - 1, h[i][j]);
    }
}
