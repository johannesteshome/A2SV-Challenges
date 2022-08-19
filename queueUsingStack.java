import java.util.*;
class MyQueue {
    Stack<Integer> myStack = new Stack<>();
    

    public MyQueue() {
         
    }
    
    public void push(int x) {
        myStack.push(x);
    }
    
    public int pop() {
        int poppedItem = myStack.get(0);
        
   myStack.remove(0);
        return poppedItem;
    }
    
    public int peek() {
            return myStack.firstElement();
       }
    
    public boolean empty() {
         return myStack.empty(); 

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
