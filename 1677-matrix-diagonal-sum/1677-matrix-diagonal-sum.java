class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,n=mat.length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j || i+j==mat.length-1){
                    sum+=mat[i][j];
                } 
            }
        }
        return sum;
    }
}