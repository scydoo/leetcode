package lee;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

/*
 * 简化路径
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * 未考虑输入为////，此时输出应为/
 * bug point :一定记得判断stack是否为空
 */
public class SimplifyPath {

	public String simplifyPath(String path) {
		String[] array = path.split("/");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < array.length; i++) {
        	if (array[i].equals(".") || array[i].isEmpty()) {
        		continue;
        	} else if (array[i].equals("..")) {
        		if (!stack.isEmpty()) {
        			stack.pop();
        		}
        	} else {
        		stack.push(array[i]);
        	}
        }
        String s = "";
        for (String s1 : stack) {
        	s += "/" + s1;
        }
        return s.isEmpty() ? "/" : s;
    }
	public String simplifyPath(String path) {
		 Deque<String> stack = new LinkedList<>();
		 Set<String> skip = new HashSet<String>(Arrays.asList("..",".",""));
		 for (String dir : path.split("/")) {
			 if (dir.equals("..") && !stack.isEmpty()) 
				 stack.pop();
			 else if (!skip.contains(dir)) 
				 stack.push(dir);
		 }
		 String res = "";
		 for (String dir : stack) res = "/" + dir + res;
		 return res.isEmpty() ? "/" : res;
		}

}
