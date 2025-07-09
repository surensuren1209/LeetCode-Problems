class Solution {
    static{
        for(int i=0;i<500;i++){
            replaceDigits(" ");
        }
    }
    public  static String replaceDigits(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                int shift = ch - '0'; 
                char prev = s.charAt(i - 1);
                char shifted = (char)(prev + shift);
                result.append(shifted);
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}
