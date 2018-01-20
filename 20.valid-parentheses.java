class Solution {
    public boolean isValid(String s) {
//	List<Character> stack = new LinkedList<Character>();
	Stack<Character> stack = new Stack<Character>();
	int len = s.length();
	for(int i = 0; i < len; i++){
	    Character c = s.charAt(i);
	    if(c == '(' || c=='{' || c=='[')
		stack.push(c);
	    else if(c == ']'){
		if(stack.isEmpty() || stack.pop() != '[')
		    return false;
	    }
	    else if(c == ')'){
		if(stack.isEmpty() || stack.pop() != '(')
		    return false;
	    }
	    else if(c == '}'){
		if(stack.isEmpty() || stack.pop() != '{')
		    return false;
	    }
	}
	if(stack.isEmpty())
	    return true;
	else
	    return false;
    }
}
