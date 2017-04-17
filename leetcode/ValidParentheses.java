package lee;
/*
 * bug-freeä�㣺���ж�stack�Ƿ�Ϊ��
 */
public class ValidParentheses {

	public boolean isValid(String s) {
		if (s.isEmpty()) {
			return true;
		}
		Stack<Character> stack = new Stack<Character>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if ((c[i] == ')' && !stack.isEmpty() && stack.peek() == '(') || (c[i] == '}' && !stack.isEmpty() && stack.peek() == '{') || (c[i] == ']' && !stack.isEmpty() && stack.peek() == '[')) {
				stack.pop();
			} else {
				stack.push(c[i]);
			}
		}
		return stack.isEmpty();
	}

}
