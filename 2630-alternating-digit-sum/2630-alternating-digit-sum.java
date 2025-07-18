class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        char[] arr = String.valueOf(n).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] - '0'; 
            if (i % 2 == 0) sum += digit;
            else sum -= digit;
        }
        return sum;
    }
}
