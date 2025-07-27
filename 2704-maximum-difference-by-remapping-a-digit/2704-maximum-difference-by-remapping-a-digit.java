class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
    
        char max = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                max = c;
                break;
            }
        }
        String maxStr = s.replace(max, '9');
        int maxNum = Integer.parseInt(maxStr);

        char min = s.charAt(0);
        String minStr = s.replace(min, '0');
        int minNum = Integer.parseInt(minStr);

        return maxNum - minNum;
    }
}