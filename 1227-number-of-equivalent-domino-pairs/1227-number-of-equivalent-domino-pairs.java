class Solution {
    public int numEquivDominoPairs(int[][] dom) {
        int[] arr = new int[100];
        int cnt = 0;

        for (int[] p : dom) {
            int l = Math.min(p[0], p[1]);
            int h = Math.max(p[0], p[1]);
            
            int result = l * 10 + h;
            cnt += arr[result]++;
        }
        return cnt;
    }
}