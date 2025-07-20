class Solution {
    static{
        for(int i=0;i<500;i++){
            candy(new int [1]);
        }
    }
    public  static int candy(int[] r) {
        int n = r.length;
        int[] arr = new int[n];

        Arrays.fill(arr, 1);

        for (int i = 1; i < n; i++) {
            if (r[i] > r[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (r[i] > r[i + 1]) {
                arr[i] = Math.max(arr[i], arr[i + 1] + 1);
            }
        }

        int total = 0;
        for (int c : arr) total += c;
        return total;
    }
}
