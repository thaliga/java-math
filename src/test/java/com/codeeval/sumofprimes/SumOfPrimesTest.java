package com.codeeval.sumofprimes;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumOfPrimesTest {

	private SumOfPrimes sop;
	
	@Before
	public void setUp() {
		sop = new SumOfPrimes();
	}
	
	@After
	public void tearDown() {
		sop = null;
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void calculate_NegativeInput_ThrowsException() throws Exception {
		// given
		int numberOfPrimes = -1;
		
		// when
		sop.calculate(numberOfPrimes);
	}

	@Test
	public void calculate_ZeroPrimes_Returns0() throws Exception {
		// given
		int numberOfPrimes = 0;
		
		// when
		long result = sop.calculate(numberOfPrimes);
		
		// then
		assertEquals(0L, result);
	}

	@Test
	public void calculate_FirstPrime_Returns2() throws Exception {
		// given
		int numberOfPrimes = 1;
		
		// when
		long result = sop.calculate(numberOfPrimes);
		
		// then
		assertEquals(2L, result);
	}

	@Test
	public void calculate_TwoPrimes_Returns5() throws Exception {
		// given
		int numberOfPrimes = 2;
		
		// when
		long result = sop.calculate(numberOfPrimes);
		
		// then
		assertEquals(5L, result);
	}

	@Test
	public void calculate_ThreePrimes_Returns10() throws Exception {
		// given
		int numberOfPrimes = 3; // 2 3 5
		
		// when
		long result = sop.calculate(numberOfPrimes);
		
		// then
		assertEquals(10L, result);
	}

	@Test
	public void calculate_TenPrimes_Returns129() throws Exception {
		// given
		int numberOfPrimes = 10; // 2 3 5 7 11 13 17 19 23 29
		
		// when
		long result = sop.calculate(numberOfPrimes);
		
		// then
		assertEquals(129L, result);
	}

	@Test
	public void calculate_ThousandPrimes_Returns3682913() throws Exception {
		// given
        double time = nanoTime();
		int numberOfPrimes = 1000; 
		
		// when
		long result = sop.calculate(numberOfPrimes);
		
		// then
        checkResult("SumOfPrimes", 3682913L, result, time);
	}
}
