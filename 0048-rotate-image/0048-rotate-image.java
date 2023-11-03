class Solution {
    public int[][] rotate(int[][] matrix) {
        int n=matrix.length, c=0;        
        int[] arr=new int[n*n];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix[0].length-1;j>=0;j--){
                arr[c++]=matrix[j][i];
            }            
        }
        c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=arr[c++];                
            }            
        }

        
        return matrix;
    }
}