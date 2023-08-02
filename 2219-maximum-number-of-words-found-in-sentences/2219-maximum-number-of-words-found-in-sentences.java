class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] arr=new int[100];
        String[] str=new String[100];
        for(int i=0;i<sentences.length;i++){
            str = sentences[i].split(" ");
            arr[i]=str.length;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}