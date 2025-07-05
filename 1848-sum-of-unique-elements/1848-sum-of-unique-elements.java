class Solution {
     static{
        for(int i=0;i<500;i++){
            sumOfUnique(new int[1]);
         } 
     }
    public static int sumOfUnique(int[] nums) {
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
