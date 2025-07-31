import java.util.HashSet;
import java.util.Set;

class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        
        for (int x : arr) {
            Set<Integer> temp = new HashSet<>();
            temp.add(x);
            for (int y : set) {
                temp.add(x | y);
            }
            result.addAll(temp);
            set = temp;
        }
        
        return result.size();
    }
}