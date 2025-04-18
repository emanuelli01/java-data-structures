

import java.util.Stack;

public class test{
	public static void main(String[] args) {
		String expr = "(X + Y)( - (X - Y)";
		Stack<Character> stack = new Stack<>();

		boolean active = true;

		for (char c : expr.toCharArray()) {
			if(c == '(') stack.push(c);
			else if (c == ')') {
				if (stack.isEmpty()) {
					active = false;
					break;
				} 
				else stack.pop();
			}
		}
		if (active) System.out.println("VALIDO");
		else System.out.println("INVALIDO");
	}
}