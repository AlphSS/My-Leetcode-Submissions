class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                if(st.isEmpty()) return false;
                char t = st.peek();
                if((t == '(' && c != ')') || (t == '{' && c != '}') || (t == '[' && c != ']')) return false;
                st.pop();
            }
        }

        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}