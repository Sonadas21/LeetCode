class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums[0], count=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[count]!=nums[i]){
                count++;
                nums[count]=nums[i];              
            } 
        }
        return count+1;
    }
}