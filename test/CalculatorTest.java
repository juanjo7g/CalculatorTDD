import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator;

	@BeforeClass
	public static void init() {
		calculator = new Calculator();
	}

	@Test
	public void addIntPositive() {
		int result = calculator.add(1, 2);
		assertEquals(3, result);
	}

	@Test
	public void addIntNegative() {
		int result = calculator.add(-1, -3);
		assertEquals(-4, result);
	}

	@Test
	public void subIntPositive() {
		int result = calculator.sub(3, 3);
		assertEquals(0, result);
	}

	@Test
	public void subIntNegative() {
		int result = calculator.sub(-3, -2);
		assertEquals(-1, result);
	}

	@Test
	public void addIntZero() {
		int result = calculator.add(0, 0);
		assertEquals(0, result);
	}

	@Test
	public void multIntPositive() {
		int result = calculator.mult(3, 5);
		assertEquals(15, result);
	}

	@Test
	public void multIntNegative() {
		int result = calculator.mult(4, -5);
		assertEquals(-20, result);
	}
	
	@Test
	public void multIntZero() {
		int result = calculator.mult(0, 5);
		assertEquals(0, result);
	}
	
	@Test
	public void divIntPositive() {
		int result = calculator.div(10, 5);
		assertEquals(2, result);
	}
	

	@Test
	public void divIntNegative() {
		int result = calculator.div(-30, -5);
		assertEquals(6, result);
	}
	
	@Test
	public void addBigIntPositive() {
		int result = calculator.add(20000000, 3);
		assertEquals(20000003, result);
	}

	
	@Test
	public void addBiggerIntPositive() {
		int result = calculator.add(99999999, 99999999);
		assertEquals(199999998, result);
	}
	
	@Test
	public void divIntZero() {
		Integer result = calculator.div(30, 0);
		assertEquals(null, result);
	}
	
	@Test
	public void divIntZero2() {
		Integer result = calculator.div(0, 10);
		assertEquals((Integer) 0, result);
	}	
		
}
