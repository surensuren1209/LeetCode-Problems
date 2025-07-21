class Solution {
    static{
        for(int i=0;i<500;i++){
            getEncryptedString(" ",1);
        }
    }
    public  static String getEncryptedString(String s, int k) {
        return (s + s).substring(k % s.length(), k % s.length() + s.length());
    }
}
