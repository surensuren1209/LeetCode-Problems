class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        str = str.replaceFirst("6", "9");
        return Integer.parseInt(str);
    }
}