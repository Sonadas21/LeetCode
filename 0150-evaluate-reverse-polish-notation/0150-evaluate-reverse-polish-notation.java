class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String token:tokens){
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                s.push(Integer.parseInt(token));
            }
            else{
                int val1=s.pop();
                int val2=s.pop();
            
                switch(token){
                    case "+":
                    s.push(val2+val1);
                    break;
                    case "-":
                    s.push(val2-val1);
                    break;
                    case "*":
                    s.push(val2*val1);
                    break;
                    case "/":
                    s.push(val2/val1);
                    break;
                }
            }
        }
        return s.pop();
    }
}