package lee;

import java.util.Stack;

public class ImplementQueuesusingStack {

	public static void main(String[] args) {

	}

}
class MyQueue {

    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();
    
    public void push(int x) {
        input.push(x);
    }

    public void pop() {
        peek();
        output.pop();
    }

    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }
}
public class MyQueue2 {

    /** Initialize your data structure here. */
	Stack<Integer> stack;
	Stack<Integer> stackRead;
    public MyQueue2() {
        stack = new Stack<Integer>();
        stackRead = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!stackRead.isEmpty()) {
        	return stackRead.pop();
        }
        while (!stack.isEmpty()) {
        	stackRead.push(stack.pop());
        }
        return stackRead.pop();
    }
    
    /** Get the front element. */
    public int peek() {
    	if (!stackRead.isEmpty()) {
        	return stackRead.peek();
        }
    	while (!stack.isEmpty()) {
        	stackRead.push(stack.pop());
        }
        return stackRead.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty() && stackRead.isEmpty();
    }
}