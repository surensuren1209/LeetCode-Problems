class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb =new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
      for(String s : word2){
        sb1.append(s);       
      }
       for(String i : word1){
        sb.append(i);       
      }
      return sb.toString().equals(sb1.toString());
    }
}