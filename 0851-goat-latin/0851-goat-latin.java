class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String vowels = "aeiouAEIOU";
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            res.append(vowels.indexOf(w.charAt(0)) != -1 ? w : w.substring(1) + w.charAt(0));
            res.append("ma").append("a".repeat(i + 1)).append(" ");
        }

        return res.toString().trim();
    }
}
