class Solution {
    public boolean judgePoint24(int[] cards) {
        List<Double> nums = new ArrayList<>();
        for (int card : cards) nums.add((double) card);
        return solve(nums);
    }

    private boolean solve(List<Double> nums) {
        if (nums.size() == 1) return Math.abs(nums.get(0) - 24) < 1e-6;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i == j) continue;

                List<Double> rest = new ArrayList<>();
                for (int k = 0; k < nums.size(); k++) {
                    if (k != i && k != j) rest.add(nums.get(k));
                }

                double a = nums.get(i), b = nums.get(j);
                for (double result : new double[]{a + b, a - b, b - a, a * b, a / b, b / a}) {
                    if (Math.abs(result) < 1e-6 && (a == 0 || b == 0)) continue;
                    rest.add(result);
                    if (solve(rest)) return true;
                    rest.remove(rest.size() - 1);
                }
            }
        }
        return false;
    }
}