package firstest;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import firstest.Calculator;

public class TestFactorial {
      Calculator calc=new Calculator();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("before test executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After executing all test cases");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	public void testFactorial() {
		int n=5;
		int exceptedValue=120;
		int actualValue=calc.Factorial(n);
		assertEquals(exceptedValue,actualValue);
	}
}

