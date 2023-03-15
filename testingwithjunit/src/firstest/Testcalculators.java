package firstest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;


public class Testcalculators {
	Calculator calc; 
	
	@Before
	public static void setUpBeforeClass() throws Exception{
		System.out.println("Before each test");
	}
	
	@After
	public void tearDown() throws Exception{
		System.out.println("After each test");
	}
	@Test
	public void testFactorial() {
		int n=5;
		int exceptedValue=120;
		int actualValue= calc.Factorial(n);
		assertEquals(exceptedValue,actualValue);
	}
	public void testPower() {
		int inputBase =2;
		int exp=3;
		double expectedValue=8;
		double actualValue=calc.power(inputBase,exp);
		assertEquals(expectedValue,actualValue);
		//fail("Not yet implemented");
	}

}
