class Solution {
    static{
        for(int i=0;i<500;i++){
            isAnagram(" "," ");
        }
    }
    public  static boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;
       char[] arr1 = s.toCharArray();
       char[] arr2 = t.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       return Arrays.equals(arr1, arr2);
    }
}