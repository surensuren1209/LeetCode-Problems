class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        if (n == 0) {
            return 0;
        }

        int left = 0;
        long tempSum = 0;
        long result = 0;

        for (int right = 0; right < n; right++) {
            tempSum += fruits[right][1];
            
            long rightPos = fruits[right][0];
            
            while (left <= right) {
                long leftPos = fruits[left][0];
                long travel;
                
                if (startPos <= leftPos) {
                    travel = rightPos - startPos;
                } else if (startPos >= rightPos) {
                    travel = startPos - leftPos;
                } else {
                    long distToLeft = startPos - leftPos;
                    long distToRight = rightPos - startPos;
                    long cost1 = distToLeft * 2 + distToRight;
                    long cost2 = distToRight * 2 + distToLeft;
                    travel = Math.min(cost1, cost2);
                }
                
                if (travel <= k) {
                    result = Math.max(result, tempSum);
                    break;
                } else {
                    tempSum -= fruits[left][1];
                    left++;
                }
            }
        }
        return (int) result;
    }
}