class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0,visited=0;

        for(int i=0;i<nums.size();i++){
            visited = i;
            for(int j=visited+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    count++;
                }
            }
        }
        return count;
    }
}