class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
            if (temp.getValue() == 1) {
                sum += temp.getKey();
            }
        }
        return sum;
    }
}
