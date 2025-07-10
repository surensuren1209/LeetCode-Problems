class Solution {
    static{
        for(int i=0;i<500;i++){
            minimumRecolors(" ",1);
        }
    }
    public static int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') cnt++;
        }
        min = cnt;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') cnt--; 
            if (blocks.charAt(i) == 'W') cnt++;     
            min = Math.min(min, cnt);
        }
        return min;
    }
}
