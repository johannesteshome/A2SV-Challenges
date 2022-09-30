class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> myStack = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                System.out.println(tokens[i]);
                String sign = tokens[i];
                int operand2 = myStack.pop();
                int operand1 = myStack.pop();
                if(sign.equals("+")){
                    myStack.push(operand1 + operand2);
                }
                else if(sign.equals("-")){
                    myStack.push(operand1 - operand2);
                }
                else if(sign.equals("*")){
                    myStack.push(operand1 * operand2);
                }
                else if(sign.equals("/")){
                    myStack.push(operand1 / operand2);
                }
                
            }
            else{
                System.out.println(tokens[i]);
                myStack.push(Integer.parseInt(tokens[i]));
            }
        }
        
        System.out.println(myStack);
        return myStack.pop();
        
    }
}
