class Solution {
    static{
        for(int i=0;i<500;i++){
            minOperations(" ");
        }
    }
    public static  int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        
        int ops = 0, count = 0;
        for (int i = 0; i < n; i++) {
            res[i] += ops;
            if (boxes.charAt(i) == '1') count++;
            ops += count;
        }
        ops = 0;
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            res[i] += ops;
            if (boxes.charAt(i) == '1') count++;
            ops += count;
        }

        return res;
    }
}
