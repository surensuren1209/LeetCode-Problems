class Solution {
    public String sortVowels(String s) {

        String vowels = "aeiouAEIOU";

        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                list.add(c);
            }
        }
        
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                sb.append(list.get(j++));
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
