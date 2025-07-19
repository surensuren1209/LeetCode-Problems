class Solution {
    public  int finalValueAfterOperations(String[] arr) {
        int x = 0;
        for (String s : arr) {
            if (s.contains("+")){
                x++;
            }else {
                x--;
            }
        }
        return x;
    }
}
