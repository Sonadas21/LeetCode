class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int c=0;
                    result[c]=i;
                    c++;
                    result[c]=j;
                }
            }
        }
        return result;
    }
}