class Solution {
    public String truncateSentence(String s, int k) {
        int count=0,r=0;
        String str=new String();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
            if(count==k){
                r=i;
                break;
            }
        }
        if(k>count){
            for(int i=0;i<s.length();i++){
                str +=s.charAt(i);
            }
        }
        else if(k==count){
            for(int i=0;i<r;i++){
                str +=s.charAt(i);
            }
            
        }
        
        return str;
    }
}