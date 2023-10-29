class Solution {
    public boolean containsDuplicate(int[] nums) {
        int s=0;
        boolean bl=false;
        // for(int i=0;i<nums.length;i++){
        //     s=nums[i];
        //     for(int j=0;j<nums.length;j++){
        //         if(s==nums[j] && i!=j){
        //             bl=true;
        //             break;
        //         }
        //     }
        // }
        // return bl;

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                bl=true;
            }
        }
        return bl;
    }
}