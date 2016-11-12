
public class Calculator {
	public int add(int a, int b){
		return a+b;
	}
	public int sub(int a, int b){
		return a-b;
	}
	
	public int mult(int a, int b){
		return a*b;
	}
	
	public Integer div(int a, int b){
		if (b==0) {
			return null;
		}
		return a/b;
	}
	
	
}
