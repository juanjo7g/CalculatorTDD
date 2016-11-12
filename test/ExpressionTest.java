import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ExpressionTest {

	private static Expression expression;

	@BeforeClass
	public static void init() {
		expression = new Expression();
	}
	
	@Test
	public void validateExpression() {
		Boolean result = expression.validate("(5+2)");
		assertEquals(true, result);
	}
	
	@Test
	public void validateEmptyExpression() {
		Boolean result = expression.validate("");
		assertEquals(false, result);
	}
	
	@Test
	public void validateNullExpression() {
		Boolean result = expression.validate(null);
		assertEquals(false, result);
	}
	@Test
	public void validateNotationExpression() {
		Boolean result = expression.validateChars("(10+2)c");
		assertEquals(false, result);
	}
	@Test
	public void validateCompleteNotationExpression() {
		Boolean result = expression.validateChars("{(10+2)+[5*2]}");
		assertEquals(true, result);
	}
	@Test
	public void validateParenthesisCount() {
		Boolean result = expression.validateParenthesisCount("(10+(()2))");
		assertEquals(true, result);
	}
	@Test
	public void validateParenthesisCountFalse() {
		Boolean result = expression.validateParenthesisCount("(10+2()");
		assertEquals(false, result);
	}
	

}
