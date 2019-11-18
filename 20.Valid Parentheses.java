/*
Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true


*/
public class ValidParentheses {

	// 스택 : LIFO (후입선출)
	
	public static void main(String[] args) {
		System.out.println("Input : {}[]");
		System.out.println("Output : " +isValid("{}[]"));
		/*System.out.println();
		System.out.println("Input : {}[[]");
		System.out.println("Output : " +isValid("{}[[]"));
		System.out.println();
		System.out.println("Input : {}(]");
		System.out.println("Output : " +isValid("{}(]"));
		System.out.println();
		System.out.println("Input : ()");
		System.out.println("Output : " +isValid("()"));*/
	}
	
	 public static boolean isValid(String s) {
		
		 /*Map<Character, Character> map = new HashMap<>();
	        map.put('(', ')');
	        map.put('{', '}');
	        map.put('[', ']');*/
		
		 Stack<Character> stack = new Stack<Character>();
		 boolean isValid = false;
		 
		 for(int i = 0; i< s.length(); i ++) {
			 // charAt(i) : i번째 문자를 읽는다.
			 char ch = s.charAt(i);
			 if( ch == '(' || ch == '{' || ch == '[') {
				 stack.push(ch);
			 } else {
				 						// peek : 스택에서 top이 가리키는 데이터를 읽는 작업
				 if(!stack.isEmpty() && isPair(stack.peek(), ch)) {
					 stack.pop();
					 
				 } else {
					 return false;
				 }
			 }
		 }
		 return stack.isEmpty();
	 }

	private static boolean isPair(char c1, char c2) {
		return  (c1 == '(' && c2 == ')') ||
				(c1 == '{' && c2 == '}') ||
				(c1 == '[' && c2 == ']');
	}
}
