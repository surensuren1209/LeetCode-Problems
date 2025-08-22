class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int top = m, bottom = -1, left = n, right = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    top = Math.min(top, i);
                    bottom = Math.max(bottom, i);
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                }
            }
        }
        return bottom == -1 ? 0 : (bottom - top + 1) * (right - left + 1);
    }
}
