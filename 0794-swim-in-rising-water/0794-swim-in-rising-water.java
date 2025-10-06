import java.util.*;

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;
        int res = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int height = curr[0], x = curr[1], y = curr[2];
            res = Math.max(res, height);
            if (x == n - 1 && y == n - 1) return res;

            for (int[] d : directions) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    pq.offer(new int[]{grid[nx][ny], nx, ny});
                }
            }
        }
        return -1;
    }
}
