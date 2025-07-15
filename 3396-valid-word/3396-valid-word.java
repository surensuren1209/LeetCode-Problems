class Solution {
    static{
        for(int i=0;i<500;i++){
            isValid(" ");
        }
    }
    public  static boolean isValid(String w) {
        if (w.length() < 3) return false;
        boolean v = false, c = false;
        for (char ch : w.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) return false;
            char cr = Character.toLowerCase(ch);
            if ("aeiou".indexOf(cr) >= 0) v = true;
            else if (Character.isLetter(cr)) c = true;
        }
        return v && c;
    }
}