class Solution {
    public int distributeCandies(int[] c) {
        Set<Integer> set = new HashSet<>();
        for (int i : c) {
            set.add(i);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int val : set) {
            result[i++] = val;
        }
        int n=c.length/2;
        if(result.length>=n)
        return n;
        else
         return result.length;
    }
}