class Solution {
   
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    private int lcm(int x, int y) {
        return (x / gcd(x, y)) * y; 
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> st = new ArrayList<>();
        for (int x : nums) {
            int cur = x;
            while (!st.isEmpty()) {
                int g = gcd(st.get(st.size() - 1), cur);
                if (g == 1) break; 
                cur = lcm(st.get(st.size() - 1), cur);
                st.remove(st.size() - 1); 
            }
            st.add(cur);
        }
        return st;
    }
}