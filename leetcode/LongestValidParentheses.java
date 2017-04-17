package lee;

import java.util.Stack;

/*
 * 最优思路：入栈的是index
 * 出栈以后别忘了判断stack是否为空。
 */
public class LongestValidParentheses {

	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		int left = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else {
				if(stack.isEmpty()) {
 				left = i;
 			} else {
 				stack.pop();
 			}
 			if(stack.isEmpty()) max = Math.max(max, i - left);
 			else max = Math.max(max, i - stack.peek());
 		}
		}
		return max;
	}
	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
	 	stack.push(-1); // 不用判断是否为空，记得i - stack.peek() - 1
	 	for(int i = 0; i < s.length(); i++) {
	 		if(s.charAt(i) == ')' && stack.size() != 1 && s.charAt(stack.peek()) == '(')
	 			stack.pop();
	 		else {
	 			max = Math.max(max, i - stack.peek() - 1);
	 			stack.push(i);
			}
		 }
		 return Math.max(max, s.length() - stack.pop() - 1);
	}

}
