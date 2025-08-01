import java.util.*;

class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> result = new ArrayList<>();

        if (num == 0) {
            return result;
        }
        List<Integer> sum1 = new ArrayList<>();
        sum1.add(1);
        result.add(sum1);

        for (int i = 1; i < num; i++) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j < i; j++) {
                int sum = prev.get(j - 1) + prev.get(j);
                cur.add(sum);
            }
            cur.add(1);

            result.add(cur);
        }

        return result;
    }
}