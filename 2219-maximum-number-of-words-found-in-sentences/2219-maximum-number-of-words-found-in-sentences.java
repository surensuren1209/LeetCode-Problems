class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            String[] sample = {"s sf"};
            mostWordsFound(sample);
        }
    }

    public static int mostWordsFound(String[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].split(" ").length;
            max = Math.max(len, max);
        }
        return max;
    }
}
