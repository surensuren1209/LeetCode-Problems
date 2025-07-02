import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        Arrays.sort(arr1);
        int[] res = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    res[k++] = arr1[j];
                    arr1[j] = -1;
                }
            }
        }

        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] != -1) {
                res[k++] = arr1[j];
            }
        }

        return res;
    }
}
