class Solution {
    static {
        for(int i=0;i<500;i++){
            titleToNumber("A");
        }
    }
    public  static int titleToNumber(String str) {
        int result = 0;
        for (char c : str.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
