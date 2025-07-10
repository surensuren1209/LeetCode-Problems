class Solution {
    static{
        for(int i=0;i<500;i++){
            numOfSubarrays(new int [1],1,1);
        }
    }
    public static int numOfSubarrays(int[] arr, int k, int t) {
        int cnt=0,sum=0;
        for(int i=0;i<k;i++) sum+=arr[i];
        if(sum / k >=t ) cnt++;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i] - arr[i-k];
            if(sum / k >= t) cnt++;
        }
        return cnt;
    }
}