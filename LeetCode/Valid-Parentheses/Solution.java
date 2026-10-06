1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        for(int i = 0; i < s.length(); i++){
5            char c = s.charAt(i);
6            if(c == '(' || c == '{' || c == '['){
7                st.push(c);
8            }else{
9                if(st.isEmpty()) return false;
10                char t = st.peek();
11                if((t == '(' && c != ')') || (t == '{' && c != '}') || (t == '[' && c != ']')) return false;
12                st.pop();
13            }
14        }
15
16        if(st.isEmpty()){
17            return true;
18        }
19        return false;
20    }
21}