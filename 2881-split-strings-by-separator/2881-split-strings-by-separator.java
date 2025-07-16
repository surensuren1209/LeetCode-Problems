class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char sp) {
        List<String> list = new ArrayList<>();
        for (String s : words) {
            String[] arr = s.split("\\" + sp);
            for (String i : arr) {
                if (!i.isEmpty()) {
                    list.add(i);
                }
            }
        }
        return list;
    }
}
