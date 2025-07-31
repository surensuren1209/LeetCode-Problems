class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int num = (n + k - 1) / k;
        String[] result = new String[num];
        
        for (int i = 0; i < num; i++) {
            int start = i * k;
            int end = Math.min(start + k, n);
            String sub = s.substring(start, end);
            
            if (sub.length() < k) {
                StringBuilder sb = new StringBuilder(sub);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                sub = sb.toString();
            }
            result[i] = sub;
        }
        
        return result;
    }
}