class Solution {
    public int pivotInteger(int n) {
        int ans= ((n*n)+n)/2;
        int sq=(int)Math.sqrt(ans);
        if(ans==sq*sq) return sq;

        return -1;
    }
}