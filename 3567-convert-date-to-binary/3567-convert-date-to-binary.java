class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        String by = Integer.toBinaryString(year);
        String bm = Integer.toBinaryString(month);
        String bd = Integer.toBinaryString(day);

        return by + "-" + bm + "-" + bd;
    }
}
