class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;
     
 /** Initialize your data structure here. */
 public MyQueue() {
     inStack = new Stack();
     outStack = new Stack();
 }
 
 /** Push element x to the back of queue. */
 public void push(int x) {
     
     inStack.push(x);
     
 }
 
 /** Removes the element from in front of queue and returns that element. */
 public int pop() {
     
     peek();
     return outStack.pop();       
     
 }
 
 /** Get the front element. */
 public int peek() {
     if (outStack.isEmpty()){
         while(!inStack.isEmpty()){
             outStack.push(inStack.pop());
         }
     }
     return outStack.peek();
     
     
 }
 
 /** Returns whether the queue is empty. */
 public boolean empty() {
     return (inStack.isEmpty() && outStack.isEmpty());
 }
}

// Your MyQueue object will be instantiated and called as such:

