class Solution {
    public String concatHex36(int n) {
        int n2=n*n;
        int n3=n*n*n;
         String hd= Integer.toHexString(n2).toUpperCase();
         String ht = Integer.toString(n3, 36).toUpperCase();
         return hd.concat(ht);
    }
}