import java.util.regex.*;

class Solution {
    public int maxFreqSum(String s) {
        int v = 0;
        int co = 0;
        String vowels = "aeiou";
        
        for (char c = 'a'; c <= 'z'; c++) {
            String cr = String.valueOf(c);
            Pattern p = Pattern.compile(Pattern.quote(cr));
            Matcher m = p.matcher(s);
            int count = 0;
            while (m.find()) {
                count++;
            }
            if (vowels.indexOf(c) != -1) {
                v = Math.max(v, count);
            } else {
                co = Math.max(co, count);
            }
        }
        return v + co;
    }
}
