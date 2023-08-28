class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(stack.size()==0) return false;
                if(stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(s.charAt(i)==']'){
                if(stack.size()==0) return false;
                if(stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(s.charAt(i)=='}'){
                if(stack.size()==0) return false;
                if(stack.peek()=='{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.size()==0;
    }
}