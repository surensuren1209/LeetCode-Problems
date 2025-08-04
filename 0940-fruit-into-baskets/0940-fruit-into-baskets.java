import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        int maxLen = 0, start = 0;
        Map<Integer, Integer> counts = new HashMap<>();

        for (int end = 0; end < fruits.length; ++end) {
            int fruitType = fruits[end];
            counts.put(fruitType, counts.getOrDefault(fruitType, 0) + 1);

            while (counts.size() > 2) {
                int startFruitType = fruits[start];
                counts.put(startFruitType, counts.get(startFruitType) - 1);
                
                if (counts.get(startFruitType) == 0) {
                    counts.remove(startFruitType);
                }
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}