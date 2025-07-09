class Solution {
    static{
        for(int i=0;i<500;i++){
            countVowelSubstrings(" ");
        }
    }
    public static int countVowelSubstrings(String word) {
        int cnt = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {
            if (isVowel(word.charAt(i))) {
                Set<Character> set = new HashSet<>();
                for (int j = i; j < n; j++) {
                    char c = word.charAt(j);
                    if (!isVowel(c)) break;
                    set.add(c);
                    if (set.size() == 5) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
