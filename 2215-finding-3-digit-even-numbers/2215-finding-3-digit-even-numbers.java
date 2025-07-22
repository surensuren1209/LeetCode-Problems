import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new TreeSet<>();

        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue; 
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) {
                        set.add(num);
                    }
                }
            }
        }
        int[] res = new int[set.size()];
        int i= 0;
        for (int num : set) {
            res[i++] = num;
        }

        return res;
    }
}
