class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans = 0;
        int n = fruits.length;

        for(int i=0; i < n; i++){
            int flag = 0;
            for(int j=0; j < n; j++){
                if(baskets[j] >= fruits[i]){
                    baskets[j] = 0;
                    flag = 1;
                    break;
                }
            }
            ans += flag;
        }

        return n - ans;
        
    }
}