class Solution {
    static long arr[]=new long[18];
    static long helper(int x){
        if (x==0) return 0;
        int log4=(31-Integer.numberOfLeadingZeros(x))>>1;
        int r=x-(1<<(log4<<1));
        return arr[log4]+r*(log4+1L);
    }
    static public long minOperations(int[][] queries) {
        arr[0]=1;
        for(int i=1; i<18; i++)
            arr[i]=arr[i-1]+3L*i*(1L<<(2*(i-1)))+1;
        long op=0;
        for(int[] q : queries){
            int l=q[0]-1, r=q[1];
            op+=(helper(r)-helper(l)+1)>>1;
        }
        return op;
    }
}