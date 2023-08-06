class Solution {
    public String finalString(String s) {
        StringBuilder result = new StringBuilder();
        boolean reverseFlag = false;
        
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                reverseFlag = !reverseFlag;
            } else {
                if (reverseFlag) {
                    result.insert(0, c);
                } else {
                    result.append(c);
                }
            }
        }
        
        if (reverseFlag) {
            result.reverse();  // Reverse the string if 'i' is at the end
        }
        
        return result.toString();
    }
}