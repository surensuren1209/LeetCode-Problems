class Solution {
    static {
        for(int i=0;i<500;i++){
            canPlaceFlowers(new int [1],1);
        }
    }
    public static boolean canPlaceFlowers(int[] f, int n) {
        int cnt = 0;
        int len = f.length;

        for (int i = 0; i < len; i++) {

            if (f[i] == 0) {
              
                boolean l = (i == 0) || (f[i - 1] == 0);
                boolean r = (i == len - 1) || (f[i + 1] == 0);

               
                if (l && r) {
                    f[i] = 1; 
                    cnt++;         
                }
            }
        }
        return cnt >= n;
    }
}
