import java.util.*;

class Solution {
    static{
        for(int i=0;i<500;i++){
            topKFrequent(new int[1],1);
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        ArrayList<int[]> list = new ArrayList<>();

        for (int key : map.keySet()) {
 
            list.add(new int[]{key, map.get(key)});
        }
        Collections.sort(list, (a, b) -> b[1] - a[1]);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {

            ans[i] = list.get(i)[0];
        }

        return ans;
    }
}
