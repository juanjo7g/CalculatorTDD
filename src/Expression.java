import java.util.Stack;

public class Expression {

	char allows[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '*', '/', '(', ')', '{', '}', '[',
			']', '.' };

	public Boolean validate(String expression) {
		if (expression == null || expression.equals("") || !validateChars(expression)) {
			return false;
		}
			
			return true;
	}

	public boolean validateChars(String input) {
		char inputArray[] = input.toCharArray();
		for(int i = 0; i < inputArray.length; i++){
			boolean charValid = false;
			for(int j = 0; j < allows.length; j++){
				if(inputArray[i] == allows[j]){
					charValid = true;
				}
			}
			if(!charValid){
				return false;
			}
		}
		return true;
	}
	
	public boolean validateParenthesisCount(String input){
		char inputArray[] = input.toCharArray();
		Stack stack = new Stack();
		for (int i = 0; i < inputArray.length; i++) {
			char c = inputArray[i];
			if(c == '('){
				stack.push(c);
			}else if(c == ')'){
				stack.pop();
			}
		}
		if(!stack.isEmpty()){
			return false;
		}
		return true;
	} 
	

}
