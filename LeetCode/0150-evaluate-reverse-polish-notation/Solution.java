class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int num2 = st.pop();
                int num1 = st.pop();
                String op = tokens[i];
                switch(op){
                    case "+": st.push(num1 + num2);break;
                    case "-": st.push(num1 - num2);break;
                    case "*": st.push(num1 * num2);break;
                    case "/": st.push(num1 / num2);break;
                }
            }else{
                int val = Integer.parseInt(tokens[i]);
                st.push(val);
            }
        }
        return st.peek();
    }
}