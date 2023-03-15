package testexception;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExceptionTestDemo {

	int a;
	int b;
	int c;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a=10;
		b=0;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=ArithmeticException.class)
	public void test() {
		c=a/b;
		System.out.println("result ="+c);
		
	}

}
