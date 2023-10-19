class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }

        int right = 1, left=0;

        for(int i=0;i<n;i++){
            int tmp = right;
            right = left + right;
            left = tmp;
        }
        return right;
    }
}