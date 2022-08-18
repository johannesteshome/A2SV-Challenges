class MyStack {

    private Node front, rear; 
    private int queueSize; 
  

    private class Node { 
        int data;
        Node next;
    }

    public MyStack() {
        front = null;
        rear = null;
        queueSize = 0;
    }
    
    public int dequeue(){
        int data = front.data;
        front = front.next;
        if (empty()) {
            rear = null;
        }
        queueSize--;
 
        return data;
 }
  
    public void enqueue(int data){
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (empty()) {
            front = rear;
        }
        else  {
            oldRear.next = rear;
        }
        queueSize++;
 }
  
    
    public void push(int x) {
      enqueue(x);
    
    }
    
    public int pop() {
        int length = queueSize;
        for(int i=0; i<=length-2; i++){
            enqueue(front.data);
            dequeue();
        }
        return dequeue();
    }
    
    public int top() {
        return rear.data;
    }
    
    public boolean empty() {
        return (queueSize == 0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
