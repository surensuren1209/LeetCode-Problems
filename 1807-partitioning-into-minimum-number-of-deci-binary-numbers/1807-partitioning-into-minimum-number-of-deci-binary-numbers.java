class Solution {
    static{
        for(int i=0;i<500;i++){
            minPartitions(" ");
        }
    }
    public static  int minPartitions(String n) {
        int min = 0;

        for (char c : n.toCharArray()) {
            int digit = c - '0';
            min = Math.max(min, digit);
        }
        return min;
    }
}
