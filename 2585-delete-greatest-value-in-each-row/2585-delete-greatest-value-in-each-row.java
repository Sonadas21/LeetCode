class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int result=0;
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        for(int i=0;i<grid[0].length;i++){
            int max=0;
            for(int[] ele:grid){
                if(max <= ele[i]){
                    max = ele[i];
                }
            }
            result += max;
        }
        return result;
    }
}