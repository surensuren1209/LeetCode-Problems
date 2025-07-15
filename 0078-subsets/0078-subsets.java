class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); 
        
        for (int num : nums) {
            int len = result.size();
            for (int i = 0; i < len; i++) {
                List<Integer> cur = new ArrayList<>(result.get(i));
                cur.add(num);
                result.add(cur);
            }
        }
        
        return result;
    }
}
