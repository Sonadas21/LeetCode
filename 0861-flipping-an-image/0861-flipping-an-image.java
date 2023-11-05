class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length, tmp=0, l=image[0].length;

        for(int i=0;i<n;i++){
            //Collections.reverse(Arrays.asList(image[i]));
            for(int j=0;j<l/2;j++){
                int temp=image[i][j];
                image[i][j]=image[i][l-1-j];
                image[i][l-1-j]=temp;
            }
        }

        for(int i=0;i<n;i++){
            //Collections.reverse(Arrays.asList(image[i]));
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}