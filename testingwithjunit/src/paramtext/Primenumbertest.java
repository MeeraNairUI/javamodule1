package paramtext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class Primenumbertest {
	private final Integer inputNumber;
	private final boolean expectedResult;
	private PrimeNumber primeNumber;
@Before
public void initialize() {
	primeNumber = new PrimeNumber();
}


public  Primenumbertest(Integer inputNumber,Boolean expectedResult) {
	this.inputNumber = inputNumber;
	this.expectedResult = expectedResult;
}
@Parameterized.Parameters
public static Collection primeNumbers() {
	return Arrays.asList(new Object[][] {
		{2,true},
		{6,false},
		{19,true},
		{22,false},
		{23,true},
		{24,false},
		{10,true},
	});
}

@Test
public void testValidator() {
	System.out.println("Parameterized number is"+ inputNumber);
	assertEquals(expectedResult,primeNumber.validate(inputNumber));
	
}
}

